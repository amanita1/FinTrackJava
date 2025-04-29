package com.fintracker.authservice.controller;

import com.fintracker.authservice.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    public String register(@RequestParam String email, @RequestParam String password) {
        return authService.register(email, password);
    }

    @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String password) {
        return authService.login(email, password);
    }
}
