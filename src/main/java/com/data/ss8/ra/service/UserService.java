package com.data.ss8.ra.service;

import com.data.ss8.ra.model.User;

public interface UserService {
    User findById(int id);
    boolean add(User user);
}
