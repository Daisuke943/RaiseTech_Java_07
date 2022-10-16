package net.raisetech.SpringBootSample.service;

import net.raisetech.SpringBootSample.entity.Movie;
import net.raisetech.SpringBootSample.entity.Name;

import java.lang.reflect.InaccessibleObjectException;
import java.util.List;
import java.util.Optional;

public interface NameService {
    List<Name> findAll();
    Name findById(int id) throws NullPointerException;
    List<Movie> findByYear(int year);
}
