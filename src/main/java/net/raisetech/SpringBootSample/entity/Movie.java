package net.raisetech.SpringBootSample.entity;

import lombok.Getter;

@Getter
public class Movie {
    private int id;
    private String name;
    private String director;
    private int published_year;
}
