package com.mz.movies.dto.MovieDTOs;

import com.mz.movies.dto.CategoryDTOs.CategoryDTO;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
public class MovieDTOResponse {

    private String title;

    private String content;

    private String director;

    private List<CategoryDTO> categoryName;

    private int year;

    private LocalDate createdAt;

}
