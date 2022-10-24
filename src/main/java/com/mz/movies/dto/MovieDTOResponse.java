package com.mz.movies.dto;

import lombok.*;

import java.time.LocalDate;

@ToString
@Getter
@Setter
@EqualsAndHashCode
@Builder
public class MovieDTOResponse {

    private String title;

    private String content;

    private String director;

    private String categoryName;

    private int year;

    private LocalDate createdAt;



}
