package net.raisetech.SpringBootSample.service;

import net.raisetech.SpringBootSample.entity.Movie;
import net.raisetech.SpringBootSample.entity.Name;

import java.util.List;
import java.util.Optional;

public interface NameService {
    List<Name> findAll();
    List<Movie> findByYear(int year) throws Exception;
}
