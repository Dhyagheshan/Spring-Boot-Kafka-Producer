package com.sbkafkaproducer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sbkafkaproducer.model.MoviesModel;
import com.sbkafkaproducer.service.MoviesService;

@RestController
public class MoviesController {
	
	@Autowired
	private MoviesService moviesService;
	
	@GetMapping("/allmovies")
	public List<MoviesModel> getAllMovies(){
		
		return moviesService.getAllMovies();
	}
	
	@GetMapping("/getMovieByName/{moviename}")
	public MoviesModel getMoviesByName(@PathVariable("moviename") String moviename) {
		
		return moviesService.getMovieByName(moviename);
	}

}
