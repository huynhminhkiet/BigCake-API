package com.bigcake.controller;

import com.bigcake.model.User;
import com.bigcake.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Bigcake on 8/19/2017
 */

@RestController
public class UserController {
    private UserService mUserService;

    @Autowired
    public UserController(UserService mUserService) {
        this.mUserService = mUserService;
    }

    @RequestMapping("/users")
    public List<User> findAllUsers() {
        return mUserService.getAllUsers();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/users")
    public void addUser(@RequestBody User user) {
        mUserService.addUser(user);
    }

    @RequestMapping("/user/{id}")
    public User getUser(@PathVariable String id) {
        return mUserService.getUser(id);
    }
}
