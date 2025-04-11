package com.example.MilanoCineplexProject.Model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Reviews")
public class ReviewModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ReviewID;

    private String ReviewUsername;
    private String ReviewDescription;

    private int ReviewRating;


    @Column(nullable = false, updatable = false)
    private LocalDateTime ReviewTimestamp;

    public ReviewModel() {
        this.ReviewTimestamp = LocalDateTime.now();
    }

    @ManyToOne
    @JoinColumn(name = "MovieID")
    private MovieModel movie;

    @ManyToOne
    @JoinColumn(name = "UserID")
    private UserModel user;

    public ReviewModel(int reviewID, String reviewUsername, String reviewDescription, int reviewRating) {
        this.ReviewID = reviewID;
        this.ReviewUsername = reviewUsername;
        this.ReviewDescription = reviewDescription;
        this.ReviewRating = reviewRating;
        this.ReviewTimestamp = LocalDateTime.now();
    }

    public int getReviewID() {
        return ReviewID;
    }

    public void setReviewID(int reviewID) {
        ReviewID = reviewID;
    }

    public String getReviewUsername() {
        return ReviewUsername;
    }

    public void setReviewUsername(String reviewUsername) {
        ReviewUsername = reviewUsername;
    }

    public String getReviewDescription() {
        return ReviewDescription;
    }

    public void setReviewDescription(String reviewDescription) {
        ReviewDescription = reviewDescription;
    }

    public int getReviewRating() {
        return ReviewRating;
    }

    public void setReviewRating(int reviewRating) {
        ReviewRating = reviewRating;
    }

    public LocalDateTime getReviewTimestamp() {
        return ReviewTimestamp;
    }

    public void setReviewTimestamp(LocalDateTime reviewTimestamp) {
        ReviewTimestamp = reviewTimestamp;
    }
}
