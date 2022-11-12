package com.mz.movies.controllers;

import com.mz.movies.dto.CategoryDTOs.CategoryDTO;
import com.mz.movies.models.Category;
import com.mz.movies.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/movies/categories")
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping
    public List<CategoryDTO> getCategories() {
        return categoryService.getCategories();
    }

    @PostMapping
    public CategoryDTO addCategory(@Valid @RequestBody CategoryDTO request) {
        return categoryService.addCategory(request);
    }

    @PutMapping("/{id}")
    public CategoryDTO updateCategory(@PathVariable Long id, @Valid @RequestBody CategoryDTO request) {
        return categoryService.updateCategory(id,request);
    }

    @DeleteMapping("/{id}")
    public CategoryDTO deleteCategory(@PathVariable Long id) {
        return categoryService.deleteCategory(id);
    }



}
