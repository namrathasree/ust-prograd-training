package com.example.movieApplication.service;

import com.example.movieApplication.entity.MovieShows;
import com.example.movieApplication.repository.MovieShowsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieShowsService {
    @Autowired
    private MovieShowsRepository movieShowsRepository;

    public List<MovieShows> showsDetails(Long movieId){
        return movieShowsRepository.findByMovieMovieId(movieId);
    }

    public MovieShows getById(Long id){
        return movieShowsRepository.getById(id);
    }

}
