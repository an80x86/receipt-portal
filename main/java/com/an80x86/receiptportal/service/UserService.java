package com.an80x86.receiptportal.service;

import com.an80x86.receiptportal.model.User;

import java.util.List;

public interface UserService {

    public List<User> getAllUsers();
    public User getUserById(long id);

}