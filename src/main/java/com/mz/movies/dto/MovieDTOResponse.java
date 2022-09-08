package com.mz.movies.dto;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Builder
@Getter
@Setter
@EqualsAndHashCode
public class MovieDTOResponse {

    private String title;

//    private String content;

    private String director;

//    private int year;  // dlaczego po skompilowaniu, a następnie dodaniu tych instancji wynik pokazuje null lub 0

    private LocalDate createdAt;

}
