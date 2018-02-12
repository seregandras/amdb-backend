package com.sereg.movie.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sereg.movie.model.Movie;

public interface MovieRepository extends CrudRepository<Movie, Long> {
	List<Movie> findByName(String name);
}
