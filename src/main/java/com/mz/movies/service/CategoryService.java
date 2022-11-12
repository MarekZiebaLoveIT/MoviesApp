package com.mz.movies.service;

import com.mz.movies.dto.CategoryDTOs.CategoryDTO;

import java.util.List;

public interface CategoryService {
    List<CategoryDTO> getCategories();

    CategoryDTO addCategory(CategoryDTO request);

    CategoryDTO updateCategory(Long id, CategoryDTO request);

    CategoryDTO deleteCategory(Long id);
}
