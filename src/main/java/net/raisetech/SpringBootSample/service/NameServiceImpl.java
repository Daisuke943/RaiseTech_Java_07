package net.raisetech.SpringBootSample.service;

import net.raisetech.SpringBootSample.entity.Movie;
import net.raisetech.SpringBootSample.entity.Name;
import net.raisetech.SpringBootSample.repository.NameMapper;
import org.springframework.stereotype.Service;

import java.lang.reflect.InaccessibleObjectException;
import java.util.List;
import java.util.Optional;

@Service
public class NameServiceImpl implements NameService {
    private NameMapper nameMapper;

    public NameServiceImpl(NameMapper nameMapper) {
        this.nameMapper = nameMapper;
    }
    @Override
    public List<Name> findAll() {
        return nameMapper.findAll();
    }
    @Override
    public Name findById(int id) throws NullPointerException {
        Optional<Name> name = nameMapper.findById(id);
        if (name.isPresent()) {
            return name.get();
        } else {
            throw new NullPointerException();
        }
    }
    @Override
    public List<Movie> findByYear(int year) throws NullPointerException {
        List<Movie> movieList = this.nameMapper.findByYear(year);
        if (!movieList.isEmpty()) {
            return movieList;
        } else {
            throw new NullPointerException();
        }
    }
}
