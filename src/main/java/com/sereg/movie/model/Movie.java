package com.sereg.movie.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movies")
public class Movie implements Serializable {

	private static final long serialVersionUID = -3009157732242241606L;

	@Id
	@GeneratedValue
	private long id;

	@Column(name = "name")
	private String name;

	@Column(name = "year")
	private int year;

	@Column(name = "director")
	private String director;

	@Column(name = "score")
	private int score;

	protected Movie() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Movie(String name, int year, String director, int score) {
		this.name = name;
		this.year = year;
		this.director = director;
		this.score = score;
	}

	public String toString() {
		return String.format("Movie[id=%d, name=%s', year=%d', director=%s', score=%d']", id, name, year, director,
				score);
	}

}
