package com.mz.movies.models;


import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDate;
import java.util.List;

@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Title is required")
    @Size(min = 5, max = 50, message = "Title requires 5-50 symbols")
    private String title;

    @NotBlank(message = "Content is required")
    @Size(min = 5, max = 200, message = "Content requires 5-200 symbols")
    private String content;

    @NotBlank(message = "Name of Director is required")
    @Size(min = 3, max = 50, message = "This field requires 3-50 symbols")
    private String director;

    @NotNull(message = "Year of movie is required")
    @Min(value = 1895, message = "Minimum year is 1895")
    @Max(value = 2099, message = "Max year is set for 2099")
    private int year;

    @ManyToMany(mappedBy = "movies")
    @Column(nullable = false)
    private List<Category> category;

    private LocalDate createdAt;

}


