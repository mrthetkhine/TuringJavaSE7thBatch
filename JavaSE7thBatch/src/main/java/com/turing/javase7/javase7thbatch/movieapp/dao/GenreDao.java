/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.turing.javase7.javase7thbatch.movieapp.dao;

import com.turing.javase7.javase7thbatch.movieapp.dao.model.Genre;
import java.util.ArrayList;

/**
 *
 * @author macbook
 */
public interface GenreDao {
    ArrayList<Genre> getAllGenre();
    void addGenre(String name);
    void deleteGenreById(int id);
    void updateGenere(Genre genre);
}
