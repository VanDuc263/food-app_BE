package org.example.food_app_be.controller;

import org.example.food_app_be.model.User;
import org.example.food_app_be.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUsers(){
        System.out.println(userService.getAllUsers());
        return userService.getAllUsers();
    }
    @GetMapping("/{uid}")
    public Optional<User> getUser(@PathVariable String uid){
        return userService.getUserById(uid);
    }
    @GetMapping("/test")
    public String test(){
        return "OK";
    }

}
