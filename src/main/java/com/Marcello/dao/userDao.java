package com.Marcello.dao;

import com.Marcello.domain.user;

public interface userDao {
    public abstract user findByUsername(String username);
}