package net.raisetech.SpringBootSample.controller;

import net.raisetech.SpringBootSample.entity.Movie;
import net.raisetech.SpringBootSample.entity.Name;
import net.raisetech.SpringBootSample.service.NameService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.InaccessibleObjectException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
public class NameController {
    private final NameService nameService;
    public NameController(NameService nameService) {
        this.nameService = nameService;
    }
    @GetMapping("/names")
    public List<NameResponse> getNames() {
        return nameService.findAll().stream().map(NameResponse::new).toList();
    }
    @GetMapping("/names/{id}")
    public NameResponse getName(@PathVariable("id") int id) {
        NameResponse nameResponse = new NameResponse();
        try {
            nameResponse = new NameResponse(nameService.findById(id));
        } catch (NullPointerException e) {
            nameResponse.setErrorMessage("ユーザーが見つかりませんでした。");
        }
        return nameResponse;
    }

    @GetMapping("/movies")
    public List<MovieResponse> getMovies(@RequestParam(name = "published_year") int year) {
        List<MovieResponse> movieResponseList = new ArrayList<>();
        try {
            movieResponseList = nameService.findByYear(year).stream().map(MovieResponse::new).toList();
        } catch (NullPointerException e) {
            MovieResponse movieResponse = new MovieResponse();
            movieResponse.setErrorMessage("映画が見つかりませんでした。");
            movieResponseList.add(movieResponse);
            return movieResponseList;
        }
        return movieResponseList;
    }
}
