package com.example.MilanoCineplexProject.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Users")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int UserID;

    private String UserName;
    private String UserEmail;
    private String UserTelephone;
    private String UserAddress;

    @Column(nullable = false)
    private String UserPassword;

    private String UserRole;

    public UserModel() {
    }

    @OneToMany(mappedBy = "user")
    private List<ReviewModel> reviews;

    @OneToMany(mappedBy = "user")
    private List<TicketModel> tickets;

    public UserModel(int userID, String userName, String userEmail, String userTelephone,
                     String userAddress, String userPassword, String userRole) {
        UserID = userID;
        UserName = userName;
        UserEmail = userEmail;
        UserTelephone = userTelephone;
        UserAddress = userAddress;
        UserPassword = userPassword;
        UserRole = userRole;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int userID) {
        UserID = userID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserEmail() {
        return UserEmail;
    }

    public void setUserEmail(String userEmail) {
        UserEmail = userEmail;
    }

    public String getUserTelephone() {
        return UserTelephone;
    }

    public void setUserTelephone(String userTelephone) {
        UserTelephone = userTelephone;
    }

    public String getUserAddress() {
        return UserAddress;
    }

    public void setUserAddress(String userAddress) {
        UserAddress = userAddress;
    }

    public String getUserPassword() {
        return UserPassword;
    }

    public void setUserPassword(String userPassword) {
        UserPassword = userPassword;
    }

    public String getUserRole() {
        return UserRole;
    }

    public void setUserRole(String userRole) {
        UserRole = userRole;
    }
}
