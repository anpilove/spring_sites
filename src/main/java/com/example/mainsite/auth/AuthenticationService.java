package com.example.mainsite.auth;


import com.example.mainsite.authorization.AppUser;
import com.example.mainsite.authorization.AppUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {

    private final AppUserRepository repository;

    public AuthenticationResponce register(RegisterRequest request) {
        var user = AppUser.builder()
                .firstname(request.getFirstname())
                .lastname(request.getLastname())
                .email(request.getEmail())
                .password()


                .build();


        return null;
    }
    //                .firstname(request.getFirstname())
//                .lastname(request.getLastname())
//                .email(request.getEmail())
//                .password()
//                .build();
    public AuthenticationResponce authenticate(AuthenticationRequest request) {
        return null;
    }
}
