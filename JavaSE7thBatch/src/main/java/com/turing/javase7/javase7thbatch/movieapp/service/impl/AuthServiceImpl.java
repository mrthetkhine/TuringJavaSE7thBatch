/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.movieapp.service.impl;

import com.turing.javase7.javase7thbatch.movieapp.dao.UserDao;
import com.turing.javase7.javase7thbatch.movieapp.dao.impl.UserDaoImpl;
import com.turing.javase7.javase7thbatch.movieapp.dao.model.User;
import com.turing.javase7.javase7thbatch.movieapp.service.AuthService;
import java.util.Optional;

/**
 *
 * @author macbook
 */
public class AuthServiceImpl implements AuthService{

    UserDao userDao = new UserDaoImpl();
    User user =null;
    @Override
    public void register(String username, String password) {
        Optional<User> result = this.userDao.getUserByUserName(username);
        if(result.isPresent())
        {
            throw new RuntimeException("User already exist");
        }
        else
        {
            this.userDao.regsiter(username, password);
        }
    }

    @Override
    public boolean login(String username, String password) {
        try
        {
            this.setAuthUser(null);
            this.userDao.login(username, password);
            
            Optional<User> authUser = this.userDao.getUserByUserName(username);
            this.setAuthUser(authUser.get());
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
        
    }

    @Override
    public void setAuthUser(User user) {
        this.user = user;
    }

    @Override
    public User getAuthUser() {
        return this.user;
    }
    
}
