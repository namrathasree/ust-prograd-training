package com.example.movieApplication.repository;

import com.example.movieApplication.entity.Seats;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatsRepository extends JpaRepository<Seats, Long> {
    public Seats getBySeats(String seats);
}
