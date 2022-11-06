package com.mz.movies.dto;

import lombok.*;

import java.time.LocalDate;
import java.util.List;

@ToString
@Getter
@Setter
@EqualsAndHashCode
@Builder
public class MovieDTOResponse {

    private String title;

    private String content;

    private String director;

    private List<String> categoryName;      // String categoryName; if only one category

    private int year;

    private LocalDate createdAt;



}
