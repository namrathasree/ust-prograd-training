package com.example.movieApplication.service;

import com.example.movieApplication.entity.BookedSeats;
import com.example.movieApplication.repository.BookedSeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookedSeatService {
    @Autowired
    private BookedSeatRepository bookedSeatRepository;

    public BookedSeats saveSeat(BookedSeats bookedSeats){
        return bookedSeatRepository.save(bookedSeats);
    }


    public BookedSeats getBySeatsAndMovieShowsId(String seats, Long id){
        return bookedSeatRepository.getBySeatsAndMovieShowsId(seats,id);
    }

    public List<BookedSeats> findByCustomerUserName(String userName){
        return bookedSeatRepository.findByCustomerUserName(userName);
    }

}
