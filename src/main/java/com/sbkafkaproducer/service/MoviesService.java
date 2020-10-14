package com.sbkafkaproducer.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.sbkafkaproducer.constants.AppConstants;
import com.sbkafkaproducer.model.MoviesModel;
import com.sbkafkaproducer.repo.MoviesRepository;

@Service
public class MoviesService {

	@Autowired
	private MoviesRepository moviesRepository;
	
	private static final Logger logger = 
            LoggerFactory.getLogger(MoviesService.class);
     
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
 
	
	public List<MoviesModel> getAllMovies(){
		
		List<MoviesModel> listOfMovies=new ArrayList<>();
		listOfMovies=moviesRepository.findAll();
		String message = "all movies";
		logger.info(String.format("User opened the application to view -> %s", message));
        this.kafkaTemplate.send(AppConstants.TOPIC_NAME, "User opened the application to view -> "+ message);
		return listOfMovies;
	}
	
	public MoviesModel getMovieByName(String moviename) {
		
		MoviesModel movieModel=moviesRepository.findById(moviename).get();
		logger.info(String.format("User Searched for the movie -> %s", moviename));
        this.kafkaTemplate.send(AppConstants.TOPIC_NAME, "User Searched for the movie -> "+moviename);
		return movieModel;
		
	}
}
