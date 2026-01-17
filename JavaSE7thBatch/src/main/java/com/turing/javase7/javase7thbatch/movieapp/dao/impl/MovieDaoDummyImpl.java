/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.movieapp.dao.impl;
import com.turing.javase7.javase7thbatch.movieapp.dao.model.Movie;
import com.turing.javase7.javase7thbatch.movieapp.dao.MovieDao;
import java.util.ArrayList;

/**
 *
 * @author macbook
 */
public class MovieDaoDummyImpl implements MovieDao 
{

    ArrayList<Movie> movies =new ArrayList<>();
    public MovieDaoDummyImpl()
    {
        this.movies.add(new Movie(1,"Titanic",1995));
        this.movies.add(new Movie(2,"Inception",2000));
    }
    @Override
    public ArrayList<Movie> getAllMovie() {
        return this.movies;
    }

    @Override
    public void addMovie(Movie movie) {
        this.movies.add(movie);
    }

    @Override
    public void deleteMovieById(int movieId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void updateMovie(Movie movie) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
