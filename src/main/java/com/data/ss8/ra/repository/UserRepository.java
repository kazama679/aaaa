package com.data.ss8.ra.repository;

import com.data.ss8.ra.model.User;

public interface UserRepository {
    User findById(int id);
    boolean add(User user);
}
