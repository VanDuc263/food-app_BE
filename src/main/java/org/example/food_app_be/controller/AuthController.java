package org.example.food_app_be.controller;


import org.example.food_app_be.dto.LoginRequest;
import org.example.food_app_be.dto.LoginResponse;
import org.example.food_app_be.model.User;
import org.example.food_app_be.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.security.auth.login.LoginContext;
import java.util.Optional;

@Controller
@RequestMapping("/api/auth")
public class AuthController {
    private UserService userService;
    AuthController(UserService userService){
        this.userService=userService;
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest){
        Optional<User> userOptional = userService.getUserByEmail(loginRequest.email);

        if(userOptional.isPresent()){
            User user = userOptional.get();

            if(user.getPassword().equals(loginRequest.password)){
                String fakeToken = "ey_dummy_token_" + user.getId();

                return ResponseEntity.ok(new LoginResponse(fakeToken, user));
            }
        }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Sai email hoặc mật khẩu");
    }
}
