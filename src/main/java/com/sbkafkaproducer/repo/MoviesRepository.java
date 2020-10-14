package com.sbkafkaproducer.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sbkafkaproducer.model.MoviesModel;

@Repository
public interface MoviesRepository extends JpaRepository<MoviesModel,String> {
	
	

}
