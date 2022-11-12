package com.mz.movies.service;

import com.mz.movies.dto.CategoryDTOs.CategoryDTO;
import com.mz.movies.mapper.CategoryMapper;
import com.mz.movies.repositories.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    private final CategoryMapper categoryMapper;


    @Override
    public List<CategoryDTO> getCategories() {
        return categoryRepository.findAll()
                                 .stream()
                                 .map(categoryMapper::categoryToCategoryDTO)
                                 .collect(Collectors.toList());
    }

    @Override
    public CategoryDTO addCategory(CategoryDTO request) {
        var categoryToAdd = categoryMapper.categoryRequestToCategory(request);
        var saved = categoryRepository.save(categoryToAdd);
        return categoryMapper.categoryToCategoryDTO(saved);  // check above in slf4j
    }

    @Override
    public CategoryDTO updateCategory(Long id, CategoryDTO request) {
        var categoryToUpdate = categoryRepository.findById(id)
                                                          .orElseThrow(() -> new RuntimeException("Category not found"));
        categoryMapper.updateCategory(request, categoryToUpdate);
        categoryRepository.save(categoryToUpdate);
        return categoryMapper.categoryToCategoryDTO(categoryToUpdate);
    }

    @Override
    public CategoryDTO deleteCategory(Long id) {
        var categoryToDelete = categoryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Category not found"));
        categoryRepository.deleteById(id);
        return categoryMapper.categoryToCategoryDTO(categoryToDelete);
    }


}





// public Page<CategoryDTOResponse> getCategories(Integer pageNumber, Integer pageSize, String sortBy)
// Pageable pageable = Utils.createPageableObject(pageNumber, pageSize, sortBy);
//        var listOfCategories = categoryRepository.findAll(pageable);
//        return listOfCategories.map(categoryMapper::categoryToCategoryDTO);