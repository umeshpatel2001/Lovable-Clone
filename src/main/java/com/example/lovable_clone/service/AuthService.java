package com.example.lovable_clone.service;

import com.example.lovable_clone.dto.auth.AuthResponse;
import com.example.lovable_clone.dto.auth.LoginRequest;
import com.example.lovable_clone.dto.auth.SignupRequest;

public interface AuthService {
    AuthResponse signup(SignupRequest request);

    AuthResponse login(LoginRequest request);
}
