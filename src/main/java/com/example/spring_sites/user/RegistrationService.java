package com.example.spring_sites.user;


import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    public String register(RegistrationRequest request) {
        return "works";
    }
}
