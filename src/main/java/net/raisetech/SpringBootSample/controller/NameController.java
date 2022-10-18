package net.raisetech.SpringBootSample.controller;

import net.raisetech.SpringBootSample.entity.Movie;
import net.raisetech.SpringBootSample.entity.Name;
import net.raisetech.SpringBootSample.service.NameService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.InaccessibleObjectException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
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
    public ResponseEntity getMovies(@RequestParam(name = "published_year") int year) {
        List<MovieResponse> movieResponseList = nameService.findByYear(year).stream().map(MovieResponse::new).toList();
        // Listが空の場合はエラーメッセージをレスポンスとして返す
        if (movieResponseList.isEmpty()) {
            return ResponseEntity.ok(Map.of("message", "映画が見つかりませんでした"));
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(movieResponseList);
    }
}
