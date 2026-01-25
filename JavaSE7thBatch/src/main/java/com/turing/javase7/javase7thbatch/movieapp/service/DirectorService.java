/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.turing.javase7.javase7thbatch.movieapp.service;

import com.turing.javase7.javase7thbatch.movieapp.dao.model.Director;
import java.util.ArrayList;

/**
 *
 * @author macbook
 */
public interface DirectorService {
    ArrayList<Director> getAllDirector();
    ArrayList<Director> getAllDirectorByName(String name);
    void saveDirector(Director director);
    void deleteDirectorById(int id);
    void updateDirector(Director director);
    
}
