package com.example.MilanoCineplexProject.Service;

import com.example.MilanoCineplexProject.Model.Showtime;
import com.example.MilanoCineplexProject.Repository.ShowtimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShowtimeService {
    @Autowired
    private ShowtimeRepository repository;

    // Get all showtimes
    public List<Showtime> getAllShowtimes() {
        return repository.findAll();
    }

    // Save a showtime
    public Showtime saveShowtime(Showtime showtime) {
        return repository.save(showtime);
    }

    // Delete a showtime by ID
    public void deleteShowtime(int id) {
        repository.deleteById(id);
    }

    // Update an existing showtime
    public Showtime updateShowtime(Showtime showtime) {
        return repository.save(showtime);
    }
}
