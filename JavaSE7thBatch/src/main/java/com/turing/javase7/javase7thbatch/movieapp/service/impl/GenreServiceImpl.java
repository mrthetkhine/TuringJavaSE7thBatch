/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.movieapp.service.impl;

import com.turing.javase7.javase7thbatch.movieapp.dao.GenreDao;
import com.turing.javase7.javase7thbatch.movieapp.dao.impl.GenreDaoImpl;
import com.turing.javase7.javase7thbatch.movieapp.dao.model.Genre;
import com.turing.javase7.javase7thbatch.movieapp.service.GenreService;
import java.util.ArrayList;

/**
 *
 * @author macbook
 */
public class GenreServiceImpl implements GenreService{

    GenreDao dao = new GenreDaoImpl();
    @Override
    public ArrayList<Genre> getAllGenres() {
        return this.dao.getAllGenre();
    }

    @Override
    public void addGenre(String name) {
        this.dao.addGenre(name);
    }

    @Override
    public void deleteGenereById(int id) {
        this.dao.deleteGenreById(id);
    }

    @Override
    public void updateGenere(Genre genre) {
        this.dao.updateGenere(genre);
    }
    
}
