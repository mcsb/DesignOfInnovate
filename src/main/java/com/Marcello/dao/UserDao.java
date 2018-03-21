package com.Marcello.dao;

import com.Marcello.Entity.User;

public interface UserDao {
    public User findByUsername(String username);
}