package com.mz.movies.service;


import com.mz.movies.dto.MovieDTORequest;
import com.mz.movies.dto.MovieDTOResponse;
import org.springframework.data.domain.Page;

public interface MovieService {

    Page<MovieDTOResponse> getMovies(Integer pageSize, Integer pageNumber);

    MovieDTOResponse getMovie(Long id);

    MovieDTOResponse addMovie(MovieDTORequest request);

    MovieDTOResponse updateMovie(Long id, MovieDTORequest request);

    MovieDTOResponse deleteMovie(Long id);

}