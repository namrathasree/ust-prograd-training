package com.example.movieApplication.repository;


import com.example.movieApplication.entity.MovieShows;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieShowsRepository extends JpaRepository<MovieShows, Long> {
    public List<MovieShows> findByMovieMovieId(Long MovieId);
}
