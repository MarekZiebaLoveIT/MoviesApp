package com.mz.movies.mapper;

import com.mz.movies.dto.CategoryDTOs.CategoryDTO;
import com.mz.movies.models.Category;
import com.mz.movies.models.Movie;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.Collection;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    CategoryDTO categoryToCategoryDTO(Category category);

    @Mapping(target = "movies", source = "categoryName")
    @Mapping(target = "id", source = "categoryName")
    @Mapping(target = "createdAt", constant = "")
    Category categoryRequestToCategory(CategoryDTO request);

    @Mapping(target = "movies", source = "categoryName")
    @Mapping(target = "id", source = "categoryName")
    @Mapping(target = "createdAt", constant = "")
    void updateCategory(CategoryDTO request, @MappingTarget Category target);




}
