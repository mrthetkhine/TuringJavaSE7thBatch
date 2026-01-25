/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.turing.javase7.javase7thbatch.movieapp.dao;

import com.turing.javase7.javase7thbatch.movieapp.dao.model.Actor;
import com.turing.javase7.javase7thbatch.movieapp.dao.model.Director;
import com.turing.javase7.javase7thbatch.movieapp.dao.model.Movie;
import java.util.ArrayList;

/**
 *
 * @author macbook
 */
public interface MovieDirectorDao {
    void addDirectorToMovie(int movieId,int directorId);
    ArrayList<Director> getAllDirectorForMovie(int movieId);
    ArrayList<Movie> getAllMovieByDirector(int directorId);
}
