package com.example.MilanoCineplexProject.Model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Tickets")
public class TicketModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment ID
    private int TicketID;

    private String TicketMovie;
    private String TicketType;
    private double TicketPrice;
    private String TicketTime;
    private String TicketName;
    private String TicketEmail;
    private int TicketCount;

    private String SeatNumbers;
    private LocalDateTime BookingDateTime;
    private boolean PaymentStatus;
    private String QRCode;



    public TicketModel() {
    }

    @ManyToOne
    @JoinColumn(name = "MovieID")
    private MovieModel movie;

    @ManyToOne
    @JoinColumn(name = "UserID")
    private UserModel user;


    public TicketModel(int ticketID, String ticketMovie, String ticketType, double ticketPrice, String ticketTime,
                       String ticketName, String ticketEmail, int ticketCount, String seatNumbers,
                       LocalDateTime bookingDateTime, boolean paymentStatus, String qrCode) {
        TicketID = ticketID;
        TicketMovie = ticketMovie;
        TicketType = ticketType;
        TicketPrice = ticketPrice;
        TicketTime = ticketTime;
        TicketName = ticketName;
        TicketEmail = ticketEmail;
        TicketCount = ticketCount;
        SeatNumbers = seatNumbers;
        BookingDateTime = bookingDateTime;
        PaymentStatus = paymentStatus;
        QRCode = qrCode;
    }

    public int getTicketID() {
        return TicketID;
    }

    public void setTicketID(int ticketID) {
        TicketID = ticketID;
    }

    public String getTicketMovie() {
        return TicketMovie;
    }

    public void setTicketMovie(String ticketMovie) {
        TicketMovie = ticketMovie;
    }

    public String getTicketType() {
        return TicketType;
    }

    public void setTicketType(String ticketType) {
        TicketType = ticketType;
    }

    public double getTicketPrice() {
        return TicketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        TicketPrice = ticketPrice;
    }

    public String getTicketTime() {
        return TicketTime;
    }

    public void setTicketTime(String ticketTime) {
        TicketTime = ticketTime;
    }

    public String getTicketName() {
        return TicketName;
    }

    public void setTicketName(String ticketName) {
        TicketName = ticketName;
    }

    public String getTicketEmail() {
        return TicketEmail;
    }

    public void setTicketEmail(String ticketEmail) {
        TicketEmail = ticketEmail;
    }

    public int getTicketCount() {
        return TicketCount;
    }

    public void setTicketCount(int ticketCount) {
        TicketCount = ticketCount;
    }

    public String getSeatNumbers() {
        return SeatNumbers;
    }

    public void setSeatNumbers(String seatNumbers) {
        SeatNumbers = seatNumbers;
    }

    public LocalDateTime getBookingDateTime() {
        return BookingDateTime;
    }

    public void setBookingDateTime(LocalDateTime bookingDateTime) {
        BookingDateTime = bookingDateTime;
    }

    public boolean isPaymentStatus() {
        return PaymentStatus;
    }

    public void setPaymentStatus(boolean paymentStatus) {
        PaymentStatus = paymentStatus;
    }

    public String getQRCode() {
        return QRCode;
    }

    public void setQRCode(String qrCode) {
        QRCode = qrCode;
    }
}
