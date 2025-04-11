package com.example.MilanoCineplexProject.Repository;

import com.example.MilanoCineplexProject.Model.Showtime;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowtimeRepository extends JpaRepository<Showtime, Integer> {
    // No need for custom query methods; we can use default methods from JpaRepository
}
