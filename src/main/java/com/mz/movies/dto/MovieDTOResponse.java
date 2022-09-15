package com.mz.movies.dto;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@EqualsAndHashCode
@Builder
public class MovieDTOResponse {

    private String title;

    private String content;

    private String director;

    private int year;

    private LocalDate createdAt;

}
