package com.example.mainsite.auth;


import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthenticationController {
    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponce> register(
            @RequestBody RegisterRequest request
    ) {
        //
    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponce> register(
            @RequestBody AuthenticationRequest request
    ) {
        //
    }
}
