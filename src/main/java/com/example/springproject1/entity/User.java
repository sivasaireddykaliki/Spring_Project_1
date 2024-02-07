package com.example.springproject1.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class User extends Company{
    private String userName;
    private int userStartYear;
    private String phoneNumber;
    private String userEmailAddress;
    private String userRole;


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserStartYear() {
        return userStartYear;
    }

    public void setUserStartYear(int userStartYear) {
        this.userStartYear = userStartYear;
    }

    public String getUserEmailAddress() {
        return userEmailAddress;
    }

    public void setUserEmailAddress(String userEmailAddress) {
        this.userEmailAddress = userEmailAddress;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userStartYear=" + userStartYear +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", userEmailAddress='" + userEmailAddress + '\'' +
                ", userRole='" + userRole + '\'' +
                '}'+super.toString(); // super.toString() to print parent class properties
    }
}
