/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.movieapp.service.impl;

import com.turing.javase7.javase7thbatch.movieapp.dao.MovieDao;
import com.turing.javase7.javase7thbatch.movieapp.dao.MovieGenreDao;
import com.turing.javase7.javase7thbatch.movieapp.dao.impl.MovieDaoDummyImpl;
import com.turing.javase7.javase7thbatch.movieapp.dao.impl.MovieDaoImpl;
import com.turing.javase7.javase7thbatch.movieapp.dao.impl.MovieGenreDaoImpl;
import com.turing.javase7.javase7thbatch.movieapp.dao.model.Movie;
import com.turing.javase7.javase7thbatch.movieapp.service.MovieService;
import java.util.ArrayList;

/**
 *
 * @author macbook
 */
public class MovieServiceImpl implements MovieService {

    MovieDao dao = new MovieDaoImpl();
    MovieGenreDao movieGenreDao = new MovieGenreDaoImpl();
    
    @Override
    public ArrayList<Movie> getAllMovie() {
        return dao.getAllMovie();
    }

    @Override
    public void addMovie(String title,int year) {
        Movie movie = new Movie(0,title,year);
        this.dao.addMovie(movie);
    }

    @Override
    public void deleteMovieById(int id) {
        this.dao.deleteMovieById(id);
    }

    @Override
    public void updateMovie(Movie movie) {
        this.dao.updateMovie(movie);
    }

    @Override
    public void addGenereToMovie(int movieId, int genreId) {
        this.movieGenreDao.saveMovieGenre(movieId, genreId);
    }
    
}
