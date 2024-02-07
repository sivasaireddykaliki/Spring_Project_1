package com.example.springproject1.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component

public class Company {
    private String companyName;
    private String companyAddress;
    private String companyDomain;
    private int foundedYear;
    private double companyRevenue;
    private int users_count;

    public Company(){

    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getCompanyDomain() {
        return companyDomain;
    }

    public void setCompanyDomain(String companyDomain) {
        this.companyDomain = companyDomain;
    }

    public int getFoundedYear() {
        return foundedYear;
    }

    public void setFoundedYear(int foundedYear) {
        this.foundedYear = foundedYear;
    }

    public double getCompanyRevenue() {
        return companyRevenue;
    }

    public void setCompanyRevenue(double companyRevenue) {
        this.companyRevenue = companyRevenue;
    }

    public int getUsers_count() {
        return users_count;
    }

    public void setUsers_count(int users_count) {
        this.users_count = users_count;
    }

    @Override
    public String toString() {
        return " Company{" +
                "companyName='" + companyName + '\'' +
                ", companyAddress='" + companyAddress + '\'' +
                ", companyDomain='" + companyDomain + '\'' +
                ", foundedYear=" + foundedYear +
                ", companyRevenue=" + companyRevenue +
                ", users_count=" + users_count +
                '}';
    }
}
