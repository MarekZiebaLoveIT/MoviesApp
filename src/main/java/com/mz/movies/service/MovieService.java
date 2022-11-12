package com.mz.movies.service;


import com.mz.movies.dto.MovieDTOs.MovieDTORequest;
import com.mz.movies.dto.MovieDTOs.MovieDTOResponse;
import org.springframework.data.domain.Page;

public interface MovieService {

    Page<MovieDTOResponse> getMovies(Integer pageNumber,Integer pageSize, String sortBy);

    MovieDTOResponse getMovie(Long id);

    MovieDTOResponse addMovie(MovieDTORequest request);

    MovieDTOResponse updateMovie(Long id, MovieDTORequest request);

    MovieDTOResponse deleteMovie(Long id);

}
