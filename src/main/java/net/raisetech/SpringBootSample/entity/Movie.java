package net.raisetech.SpringBootSample.entity;

import lombok.Data;

@Data
public class Movie {
    private int id;
    private String name;
    private String director;
    private int published_year;
}
