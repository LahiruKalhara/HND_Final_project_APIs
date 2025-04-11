package com.example.MilanoCineplexProject.Controller;

import com.example.MilanoCineplexProject.Model.Showtime;
import com.example.MilanoCineplexProject.Service.ShowtimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/showtimes")
@CrossOrigin
public class ShowtimeController {

    @Autowired
    private ShowtimeService service;

    // Get all showtimes
    @GetMapping("/View")
    public List<Showtime> getAllShowtimes() {
        return service.getAllShowtimes();
    }

    // Add a new showtime
    @PostMapping("/Add")
    public Showtime createShowtime(@RequestBody Showtime showtime) {
        return service.saveShowtime(showtime);
    }

    // Delete a showtime
    @DeleteMapping("/Delete")
    public void deleteShowtime(@RequestParam int id) {
        service.deleteShowtime(id);
    }

    // Update an existing showtime
    @PutMapping("/Update")
    public Showtime updateShowtime(@RequestBody Showtime showtime) {
        return service.updateShowtime(showtime);
    }
}
