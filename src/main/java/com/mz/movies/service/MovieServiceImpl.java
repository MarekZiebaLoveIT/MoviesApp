package com.mz.movies.service;

import com.mz.movies.dto.MovieDTOs.MovieDTORequest;
import com.mz.movies.dto.MovieDTOs.MovieDTOResponse;
import com.mz.movies.mapper.MovieMapper;
import com.mz.movies.repositories.MovieRepository;
import com.mz.movies.utils.Utils;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;

    private final MovieMapper movieMapper;


    @Override
    public Page<MovieDTOResponse> getMovies(Integer pageNumber, Integer pageSize, String sortBy) {
        Pageable pageable = Utils.createPageableObject(pageNumber, pageSize, sortBy);
        var listOfMovies = movieRepository.findAll(pageable);
        return listOfMovies.map(movieMapper::movieToMovieDTO);
    }

    @Override
    public MovieDTOResponse getMovie(Long id) {
        var movie = movieRepository.findById(id)
                                          .orElseThrow(() -> new RuntimeException("Movie not found"));
        return movieMapper.movieToMovieDTO(movie);
    }

    @Override
    public MovieDTOResponse addMovie(MovieDTORequest request) {
        var movieToAdd = movieMapper.movieRequestToMovie(request);  //czy tutaj zamiana DTO na encję?
        var currentDate = LocalDate.now();
        movieToAdd.setCreatedAt(currentDate);
        return movieMapper.movieToMovieDTO(movieRepository.save(movieToAdd));
    }

    @Override
    public MovieDTOResponse updateMovie(Long id, MovieDTORequest request) {
        var movieToUpdate = movieRepository.findById(id)
                                                  .orElseThrow(() -> new RuntimeException("Movie not found"));
        movieMapper.updateMovie(request, movieToUpdate); // o chuj tu chodzi?
        movieRepository.save(movieToUpdate);
        return movieMapper.movieToMovieDTO(movieToUpdate);
    }

    @Override
    public MovieDTOResponse deleteMovie(Long id) {
        var movieToDelete = movieRepository.findById(id)
                                                  .orElseThrow(() -> new RuntimeException("Movie not found"));
        movieRepository.deleteById(id);
        return movieMapper.movieToMovieDTO(movieToDelete);
    }
}
