package com.data.ss8.ra.service;

import com.data.ss8.ra.model.User;
import com.data.ss8.ra.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserRepository userRepo;
    @Override
    public boolean add(User user) {
        return userRepo.add(user);
    }

    @Override
    public User findById(int id) {
        return userRepo.findById(id);
    }
}
