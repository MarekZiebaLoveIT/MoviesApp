package com.mz.movies.repositories;

import com.mz.movies.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {



}
