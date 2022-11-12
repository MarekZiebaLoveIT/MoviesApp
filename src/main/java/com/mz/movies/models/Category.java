package com.mz.movies.models;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.util.Collection;
import java.util.Set;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Category name is required")
    private String categoryName;

    private LocalDate createdAt;

    @ManyToMany
    private Set<Movie> movies;

}

//public Collection<Movie> getMovies() {
//        return movies;
//    }
//
//    public void setMovies(Collection<Movie> movies) {
//        this.movies = movies;
//    }
