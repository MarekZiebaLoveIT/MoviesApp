package com.mz.movies.dto.MovieDTOs;

import com.mz.movies.models.Category;
import lombok.*;

import java.util.List;

@ToString
@Builder
@Getter
@Setter
@EqualsAndHashCode
public class MovieDTORequest {

    private String title;

    private String content;

    private String director;

    private List<Category> category;

    private int year;

}
