package com.example.movieApplication.controller;

import com.example.movieApplication.entity.BookedSeats;
import com.example.movieApplication.entity.Seats;
import com.example.movieApplication.service.BookedSeatService;
import com.example.movieApplication.service.CustomerService;
import com.example.movieApplication.service.MovieShowsService;
import com.example.movieApplication.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

@Controller
public class BookedSeatController {
    @Autowired
    private BookedSeatService bookedSeatService;
    @Autowired
    private SeatService seatService;
    @Autowired
    private MovieShowsService movieShowsService;
    @Autowired
    private CustomerService customerService;
//    @Autowired
//    private SeatService seatService;

    @GetMapping("/{userName}/seats/{id}")
    public String seats(@PathVariable String userName, @PathVariable Long id, Model model) {
        model.addAttribute("shows", id);
        model.addAttribute("userName", userName);
        return "seats";
    }

    @GetMapping("/{userName}/booked/{shows}")
    public String booked(@PathVariable String userName, @PathVariable Long shows, Model model) {
        model.addAttribute("userName", userName);
        model.addAttribute("shows", shows);
        return "booked";
    }

    @PostMapping("/{userName}/booked/{shows}")
    public String seatBooked(@PathVariable String userName, @PathVariable Long shows, HttpServletRequest request, Model model) {
        String bookSeats = request.getParameter("bookedSeats");
        String[] bookedSeat = bookSeats.split(",");
        for (String seat : bookedSeat) {
            BookedSeats bookedSeats = bookedSeatService.getBySeatsAndMovieShowsId(seat, shows);
            if (!(Objects.isNull(bookedSeats))) {
                model.addAttribute("message", bookSeats + " Seat is already booked.");
                return "seats";
            }
        }
        for (String seat : bookedSeat) {
            Seats seats = seatService.getBySeats(seat);
            BookedSeats bookedSeats = new BookedSeats(seats.getSeats(), seats.getPrice());
            bookedSeats.setMovieShows(movieShowsService.getById(shows));
            bookedSeats.setCustomer(customerService.findCustomerByUserName(userName));
            bookedSeatService.saveSeat(bookedSeats);
        }
        return "booked";
    }

    @GetMapping("/{userName}/myBookings")
    public String myBookings(@PathVariable String userName, Model model) {
        model.addAttribute("userName", bookedSeatService.findByCustomerUserName(userName));
        return "myBookings";
    }
}







//    for (String seat : bookedSeat) {
//        Seats seats = seatService.getBySeats(seat);
//        if (bookedSeatService.existsByMovieShowsId(shows) && bookedSeatService.existsBySeats(seat)) {
//            model.addAttribute("message", seat + " Seat is already booked. Please choose another seat");
//            return "seats";
//            //return "redirect:/seats/" + shows;
//        } else {
//            BookedSeats bookedSeats = new BookedSeats(seats.getSeats(), seats.getPrice());
//            bookedSeats.setMovieShows(movieShowsService.getById(shows));
//            bookedSeatService.saveSeat(bookedSeats);
//        }
//
//    }




//    @PostMapping("/booked/{shows}")
//    public String seatBooked(@PathVariable Long shows, HttpServletRequest request, Model model) {
//        String bookSeats = request.getParameter("bookedSeats");
//        String[] bookedSeat = bookSeats.split(",");
//
//        for (String seat : bookedSeat) {
//            Seats seats = seatService.getBySeats(seat);
//            if (bookedSeatService.existsByMovieShowsId(shows)) {
//                if (bookedSeatService.existsBySeats(seat)) {
//                    model.addAttribute("message", bookSeats + " Seat is already booked. Please choose another seat");
//                    return "seats";
//                    //return "redirect:/seats/" + shows;
//                } else {
//                    BookedSeats bookedSeats = new BookedSeats(seats.getSeats(), seats.getPrice());
//                    bookedSeats.setMovieShows(movieShowsService.getById(shows));
//                    bookedSeatService.saveSeat(bookedSeats);
//                }
//            } else {
//                BookedSeats bookedSeats = new BookedSeats(seats.getSeats(), seats.getPrice());
//                bookedSeats.setMovieShows(movieShowsService.getById(shows));
//                bookedSeatService.saveSeat(bookedSeats);
//            }
//
//        }
//        return "booked";
//    }
