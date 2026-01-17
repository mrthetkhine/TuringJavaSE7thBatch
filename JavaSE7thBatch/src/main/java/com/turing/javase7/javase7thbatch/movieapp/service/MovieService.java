/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.turing.javase7.javase7thbatch.movieapp.service;

import com.turing.javase7.javase7thbatch.movieapp.dao.model.Movie;
import java.util.ArrayList;

/**
 *
 * @author macbook
 */
public interface MovieService {
    ArrayList<Movie> getAllMovie();
    void addMovie(String title,int year);
    void deleteMovieById(int id);
    void updateMovie(Movie movie);
}
