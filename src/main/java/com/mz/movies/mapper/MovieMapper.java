package com.mz.movies.mapper;

import com.mz.movies.dto.MovieDTORequest;
import com.mz.movies.dto.MovieDTOResponse;
import com.mz.movies.models.Movie;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface MovieMapper {

    MovieDTOResponse movieToMovieDTO(Movie movie);

    Movie movieRequestToMovie(MovieDTORequest request);

    void updateMovie(MovieDTORequest request, @MappingTarget Movie target);

}
