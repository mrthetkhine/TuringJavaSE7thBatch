/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.turing.javase7.javase7thbatch.movieapp.service;

import com.turing.javase7.javase7thbatch.movieapp.dao.model.User;

/**
 *
 * @author macbook
 */
public interface AuthService {
    void register(String username,String password);
    boolean login(String username,String password);
    void setAuthUser(User user);
    User getAuthUser();
}
