package com.mz.movies.controllers;

import com.mz.movies.dto.MovieDTORequest;
import com.mz.movies.dto.MovieDTOResponse;
import com.mz.movies.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/movies")
public class MovieController {

    private final MovieService movieService;

    @GetMapping
    public Page<MovieDTOResponse> getMovies(@RequestParam(required = false) Integer pageSize,
                                            @RequestParam(required = false) Integer pageNumber) {
        return movieService.getMovies(pageSize, pageNumber);
    }

    @GetMapping("/{id}")
    public MovieDTOResponse getMovie(@PathVariable Long id) {
        return movieService.getMovie(id);
    }

    @PostMapping
    public MovieDTOResponse addMovie(@Valid @RequestBody MovieDTORequest request) {
        return movieService.addMovie(request);
    }

    @PatchMapping("/{id}")
    public MovieDTOResponse updateMovie(@PathVariable Long id, @Valid @RequestBody MovieDTORequest request) {
        return movieService.updateMovie(id, request);
    }

    @DeleteMapping("/{id}")
    public MovieDTOResponse deleteMovie(@PathVariable Long id) {
        return movieService.deleteMovie(id);
    }

}
