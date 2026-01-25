/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.movieapp.service.impl;

import com.turing.javase7.javase7thbatch.movieapp.dao.DirectorDao;
import com.turing.javase7.javase7thbatch.movieapp.dao.impl.DirectorDaoImpl;
import com.turing.javase7.javase7thbatch.movieapp.dao.model.Director;
import com.turing.javase7.javase7thbatch.movieapp.service.DirectorService;
import java.util.ArrayList;

/**
 *
 * @author macbook
 */
public class DirectorServiceImpl implements DirectorService{

    DirectorDao dao = new DirectorDaoImpl();
    
    @Override
    public ArrayList<Director> getAllDirector() {
        return this.dao.getAllDirectors();
    }
    @Override
    public ArrayList<Director> getAllDirectorByName(String name) {
        return this.dao.getAllDirectorsByName(name);
    }
    @Override
    public void saveDirector(Director director) {
        this.dao.saveDirector(director);
            
    }

    @Override
    public void deleteDirectorById(int id) {
        this.dao.deleteDirectorById(id);
    }

    @Override
    public void updateDirector(Director director) {
        this.dao.updateDirector(director);
    }

    
    
}
