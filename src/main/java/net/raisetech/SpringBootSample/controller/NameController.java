package net.raisetech.SpringBootSample.controller;

import net.raisetech.SpringBootSample.entity.Movie;
import net.raisetech.SpringBootSample.service.NameService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/movies")
    public List<MovieResponse> getMovies(@RequestParam(name = "published_year") int year) throws Exception {
        return nameService.findByYear(year).stream().map(MovieResponse::new).toList();
    }
}
