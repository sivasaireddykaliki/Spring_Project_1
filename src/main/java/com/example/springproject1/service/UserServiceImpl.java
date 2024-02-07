package com.example.springproject1.service;

import com.example.springproject1.entity.Company;
import com.example.springproject1.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Override
    public User userDetails() {

//        Company company = new Company();
//        company.setCompanyAddress("Canada");
//        company.setCompanyDomain("Technology");
//        company.setCompanyName("BrikPartners");
//        company.setCompanyRevenue(10000000);
//        company.setFoundedYear(2000);
//        company.setUsers_count(10000);

        User user=new User();

        user.setCompanyAddress("Canada");
        user.setCompanyDomain("Technology");
        user.setCompanyName("BrikPartners");
        user.setCompanyRevenue(10000000);
        user.setFoundedYear(2000);
        user.setUsers_count(10000);

        user.setUserName("Siva");
        user.setUserRole("Employee");
        user.setUserEmailAddress("siva@gmail.com");
        user.setPhoneNumber("1112222333");
        user.setUserStartYear(2024);

        return user;
    }
}
