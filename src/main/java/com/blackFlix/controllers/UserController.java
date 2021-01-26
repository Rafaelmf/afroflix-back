package com.blackFlix.controllers;

import com.blackFlix.models.Movie;
import com.blackFlix.models.UserProfile;
import com.blackFlix.services.MovieService;
import com.blackFlix.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @CrossOrigin
    @GetMapping("/user-list")
    public List<UserProfile> fetchUsers(@RequestParam(name = "status") String status) {
        return userService.fetchUserList(status);
    }

    @CrossOrigin
    @PatchMapping("/user-update")
    public void fetchUsers(@RequestParam(name = "email") String email, @RequestParam(name = "status") String status) {
        userService.updateUserStatus(email, status);
    }


}
