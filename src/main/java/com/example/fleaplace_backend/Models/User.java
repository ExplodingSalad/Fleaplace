package com.example.fleaplace_backend.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @Column(name = "userId", nullable = false)
    private Long userId;

    @Column(name = "userName", nullable = false)
    private String userName;

    @Column(name = "userPassword", nullable = false)
    private String userPassword;

    @Column(name = "userEmail")
    private String userEmail;

    @Column(name = "userAddressStreet")
    private String userAddressStreet;

    @Column(name = "userAddressCity")
    private String userAddressCity;

    @Column(name = "userAddressZip")
    private String userAddressZip;

    //TODO: link to all user offers (preferrably HashSet)

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long id) {
        this.userId = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserAddressStreet() {
        return userAddressStreet;
    }

    public void setUserAddressStreet(String userAddressStreet) {
        this.userAddressStreet = userAddressStreet;
    }

    public String getUserAddressCity() {
        return userAddressCity;
    }

    public void setUserAddressCity(String userAddressCity) {
        this.userAddressCity = userAddressCity;
    }

    public String getUserAddressZip() {
        return userAddressZip;
    }

    public void setUserAddressZip(String userAddressZip) {
        this.userAddressZip = userAddressZip;
    }
}
