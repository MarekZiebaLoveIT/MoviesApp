package com.mz.movies.mapper;

import com.mz.movies.dto.CategoryDTOs.CategoryDTO;
import com.mz.movies.models.Category;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    CategoryDTO categoryToCategoryDTO(Category category);

    Category categoryRequestToCategory(CategoryDTO request);

    void updateCategory(CategoryDTO request, @MappingTarget Category target);

}
