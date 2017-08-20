package com.bigcake.service;

import com.bigcake.model.User;
import com.bigcake.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bigcake on 8/19/2017
 */

@Service
public class UserService {

    private final UserRepository mUserRepository;

    @Autowired
    public UserService(UserRepository mUserRepository) {
        this.mUserRepository = mUserRepository;
    }


    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        if (mUserRepository.findAll() != null)
            users.addAll(mUserRepository.findAll());
        return users;
    }

    public User getUser(String id) {
        return mUserRepository.findOne(id);
    }

    public void addUser(User user) {
        mUserRepository.save(user);
    }
}
