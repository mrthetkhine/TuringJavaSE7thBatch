/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.turing.javase7.javase7thbatch.movieapp.dao;

import com.turing.javase7.javase7thbatch.movieapp.dao.model.*;
import java.util.ArrayList;

/**
 *
 * @author macbook
 */
public interface MovieDao {
    ArrayList<Movie> getAllMovie();
    void addMovie(Movie movie);
    void deleteMovieById(int movieId);
    void updateMovie(Movie movie);
}
