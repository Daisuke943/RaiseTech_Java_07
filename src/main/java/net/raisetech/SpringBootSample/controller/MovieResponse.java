package net.raisetech.SpringBootSample.controller;

import lombok.Getter;
import lombok.Setter;
import net.raisetech.SpringBootSample.entity.Movie;

@Getter
public class MovieResponse {
    private int id;
    private String name;
    private String director;
    private int published_year;
    @Setter
    private String errorMessage;

    public MovieResponse() {
    }
    public MovieResponse(Movie movie) {
        this.id = movie.getId();
        this.name = movie.getName();
        this.director = movie.getDirector();
        this.published_year = movie.getPublished_year();
    }
}
