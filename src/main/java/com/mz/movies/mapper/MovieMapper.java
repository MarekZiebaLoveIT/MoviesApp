package com.mz.movies.mapper;

import com.mz.movies.dto.MovieDTORequest;
import com.mz.movies.dto.MovieDTOResponse;
import com.mz.movies.models.Category;
import com.mz.movies.models.Movie;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public interface MovieMapper {

    @Mapping(target = "categoryName", source = "category")
    MovieDTOResponse movieToMovieDTO(Movie movie);

    @Mapping(target = "id", source = "title")
    @Mapping(target = "createdAt", constant = "")
    Movie movieRequestToMovie(MovieDTORequest request);

    @Mapping(target = "id", source = "title")
    @Mapping(target = "createdAt", constant = "")
    void updateMovie(MovieDTORequest request, @MappingTarget Movie target);

     default List<String> map(List<Category> value) {                                                        // default String map(List<Category> value)
        return value.stream().map(Category::getCategoryName).collect(Collectors.toList());                   // return value.get(0).getCategoryName();  if only one category
    }

}


