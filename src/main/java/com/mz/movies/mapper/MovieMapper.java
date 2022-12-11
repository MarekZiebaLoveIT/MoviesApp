package com.mz.movies.mapper;

import com.mz.movies.dto.CategoryDTOs.CategoryDTO;
import com.mz.movies.dto.MovieDTOs.MovieDTORequest;
import com.mz.movies.dto.MovieDTOs.MovieDTOResponse;
import com.mz.movies.models.Category;
import com.mz.movies.models.Movie;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface MovieMapper {

    @Mapping(target = "categoryName", source = "category")
    MovieDTOResponse movieEntityToMovieDtoResponse(Movie movieEntity);

    @IterableMapping(qualifiedByName = "categoryMapper")
    List<CategoryDTO> listCategoryToDTOList(List<Category> categoryList);

    @Named("categoryMapper")
    CategoryDTO categoryToCategoryName(Category category);

    @Mapping(target = "id", source = "title")
    @Mapping(target = "createdAt", constant = "")
    Movie movieRequestToMovie(MovieDTORequest request);

    @Mapping(target = "id", source = "title")
    @Mapping(target = "createdAt", constant = "")
    void updateMovie(MovieDTORequest request, @MappingTarget Movie target);

}


