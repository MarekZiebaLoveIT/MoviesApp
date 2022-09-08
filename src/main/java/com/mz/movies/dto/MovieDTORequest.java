package com.mz.movies.dto;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@EqualsAndHashCode
public class MovieDTORequest {

    private String title;

    private String content;

    private String director;

    private int year;

}
