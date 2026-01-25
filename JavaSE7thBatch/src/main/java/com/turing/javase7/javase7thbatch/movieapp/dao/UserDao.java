/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.movieapp.dao;

import com.turing.javase7.javase7thbatch.movieapp.dao.model.User;
import java.util.Optional;

/**
 *
 * @author macbook
 */
public interface UserDao {
    Optional<User> getUserByUserName(String username);
    void regsiter(String username,String password);
    void login(String username,String password);
}
