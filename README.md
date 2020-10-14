# Spring-Boot-Kafka-Producer
Spring Boot Kafka Producer that publishes events like searching a movie in a database to kafka

This Spring Boot Application is used for publishing events to Kafka.

Before Starting the Application create a database and add a table with name "moviesdata" in it.

Provide your database name and MySql username and password in application.properties file.

The database table fields must be the fields given in MoviesModel.class under com.sbkafkaproducer.model package.


*************************************
Note 1: To publish events to kafka:


Install  zookeeper and kafka in your machine.

start zookeeper server and kafka server in your machine.
 
Check whether both zookeeper and kafka are up and running.

After checking zookeeper and kafka run this project.

To subscribe events you must also run Spring Boot Kafka Consumer Project in parallel. Link to Spring Boot Kafka Consumer "https://github.com/Dhyagheshan/Spring-Boot-Kafka-Consumer".

Spring Boot Kafka Producer runs at localhost:9090 and Spring Boot Kafka Consumer runs at localhost:9096. This is is configured using server.port in application.properties of both the projects.

After running both the projects go to http://localhost:<yourSpringBootKafkaProducerrunningport>/swagger-ui.html.

Execute GET Operation and see your spring boot console of both Spring Boot Kafka Producer and Spring Boot Kafka Consumer.

You can see that the events/messages are published to kafka in Spring Boot Kafka Producer and are consumed in Spring Boot Kafka Consumer.


*****************************************
Note 2:

Here two brokers are used localhost:9092 and localhost:9094. You can remove localhost:9094 from application.properties file in both Spring Boot Kafka Producer and Spring Boot Kafka Consumer 

If you keep both brokers in application.properties file you have to create another server.properties for localhost:9094 with broker.id=1 and port=9094 in kafka.

kafka will have default server.properties for localhost:9092.

If you are using both the brokers(localhost:9092 and localhost:9094) as in the project, you must run kafka in you local machine for both the localhost:9092 and localhost:9094.
