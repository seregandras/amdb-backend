package com.sereg.movie.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sereg.movie.model.User;
import com.sereg.movie.repository.UserRepository;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class UserController {

	@Autowired
	UserRepository repo;

	@GetMapping(value = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<User> getAll() {
		List<User> list = new ArrayList<>();
		Iterable<User> users = repo.findAll();

		users.forEach(list::add);
		return list;
	}

	@PostMapping(value = "/user")
	public User postUser(@RequestBody User user) {

		repo.save(new User(user.getName(), user.getPassword()));
		return user;
	}

}
