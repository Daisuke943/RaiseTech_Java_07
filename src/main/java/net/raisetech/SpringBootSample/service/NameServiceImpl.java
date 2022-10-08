package net.raisetech.SpringBootSample.service;

import net.raisetech.SpringBootSample.entity.Movie;
import net.raisetech.SpringBootSample.entity.Name;
import net.raisetech.SpringBootSample.repository.NameMapper;
import org.springframework.stereotype.Service;

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
    public List<Movie> findByYear(int year) {
        return nameMapper.findByYear(year);
    }
}
