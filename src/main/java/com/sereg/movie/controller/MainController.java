package com.sereg.movie.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sereg.movie.model.Movie;
import com.sereg.movie.repository.MovieRepository;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class MainController {

	@Autowired
	MovieRepository repo;

	//@Secured({ "ROLE_ADMIN", "ROLE_USER" })
	@GetMapping(value = "/movie", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Movie> getAll() {
		List<Movie> list = new ArrayList<>();
		Iterable<Movie> movies = repo.findAll();

		movies.forEach(list::add);
		return list;
	}

	//@Secured("ROLE_ADMIN")
	@PostMapping(value = "/movie")
	public Movie postMovie(@RequestBody Movie movie) {
		repo.save(new Movie(movie.getName(), movie.getYear(), movie.getDirector(), movie.getScore()));
		return movie;
	}

	//@Secured({ "ROLE_ADMIN", "ROLE_USER" })
	@GetMapping(value = "/findbyname/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Movie> findByName(@PathVariable String name) {
		List<Movie> movies = repo.findByName(name);
		return movies;
	}

	//@Secured("ROLE_ADMIN")
	@DeleteMapping(value = "/movie/{id}")
	public void deleteMovie(@PathVariable long id) {
		repo.delete(id);
	}

}
