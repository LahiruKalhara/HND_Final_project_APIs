package com.example.MilanoCineplexProject.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Movies")
public class MovieModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int MovieID;
    private String MovieName;
    private String MovieType;
    private String MovieDirector;
    private String MovieReleaseDate;
    private String MovieUrl;

    private int Duration;
    private double Rating;
    private String Description;
    private String Language;
    private String TrailerUrl;
    private String Status;

    public MovieModel() {
    }

    @OneToMany(mappedBy = "movie")
    private List<TicketModel> tickets;

    @OneToMany(mappedBy = "movie")
    private List<ReviewModel> reviews;

    public MovieModel(int movieID, String movieName, String movieType, String movieDirector, String movieReleaseDate,
                      String movieUrl, int duration, double rating, String description, String language,
                      String trailerUrl, String status) {
        MovieID = movieID;
        MovieName = movieName;
        MovieType = movieType;
        MovieDirector = movieDirector;
        MovieReleaseDate = movieReleaseDate;
        MovieUrl = movieUrl;
        Duration = duration;
        Rating = rating;
        Description = description;
        Language = language;
        TrailerUrl = trailerUrl;
        Status = status;
    }

    public int getMovieID() {
        return MovieID;
    }

    public void setMovieID(int movieID) {
        MovieID = movieID;
    }

    public String getMovieName() {
        return MovieName;
    }

    public void setMovieName(String movieName) {
        MovieName = movieName;
    }

    public String getMovieType() {
        return MovieType;
    }

    public void setMovieType(String movieType) {
        MovieType = movieType;
    }

    public String getMovieDirector() {
        return MovieDirector;
    }

    public void setMovieDirector(String movieDirector) {
        MovieDirector = movieDirector;
    }

    public String getMovieReleaseDate() {
        return MovieReleaseDate;
    }

    public void setMovieReleaseDate(String movieReleaseDate) {
        MovieReleaseDate = movieReleaseDate;
    }

    public String getMovieUrl() {
        return MovieUrl;
    }

    public void setMovieUrl(String movieUrl) {
        MovieUrl = movieUrl;
    }

    public int getDuration() {
        return Duration;
    }

    public void setDuration(int duration) {
        Duration = duration;
    }

    public double getRating() {
        return Rating;
    }

    public void setRating(double rating) {
        Rating = rating;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String language) {
        Language = language;
    }

    public String getTrailerUrl() {
        return TrailerUrl;
    }

    public void setTrailerUrl(String trailerUrl) {
        TrailerUrl = trailerUrl;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}
