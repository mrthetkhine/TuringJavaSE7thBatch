/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.movieapp.service.impl;

import com.turing.javase7.javase7thbatch.movieapp.dao.MovieActorDao;
import com.turing.javase7.javase7thbatch.movieapp.dao.MovieDao;
import com.turing.javase7.javase7thbatch.movieapp.dao.MovieDirectorDao;
import com.turing.javase7.javase7thbatch.movieapp.dao.MovieGenreDao;
import com.turing.javase7.javase7thbatch.movieapp.dao.impl.MovieActorDaoImpl;
import com.turing.javase7.javase7thbatch.movieapp.dao.impl.MovieDaoDummyImpl;
import com.turing.javase7.javase7thbatch.movieapp.dao.impl.MovieDaoImpl;
import com.turing.javase7.javase7thbatch.movieapp.dao.impl.MovieDirectorDaoImpl;
import com.turing.javase7.javase7thbatch.movieapp.dao.impl.MovieGenreDaoImpl;
import com.turing.javase7.javase7thbatch.movieapp.dao.model.Actor;
import com.turing.javase7.javase7thbatch.movieapp.dao.model.Director;
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
    MovieActorDao movieActorDao = new MovieActorDaoImpl();
    MovieDirectorDao movieDirectorDao = new MovieDirectorDaoImpl();
    
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

    @Override
    public void addActorToMovie(int movieId, int actorId) {
        this.movieActorDao.addActorToMovie(movieId, actorId);
    }

    @Override
    public ArrayList<Actor> getAllActorForMovie(int movieId) {
        return this.movieActorDao.getAllActorForMovie(movieId);
    }

    @Override
    public void addDirectorToMovie(int movieId, int directorId) {
        this.movieDirectorDao.addDirectorToMovie(movieId, directorId);
    }

    @Override
    public ArrayList<Director> getAllDirectorForMovie(int movieId) {
        return this.movieDirectorDao.getAllDirectorForMovie(movieId);
    }

    @Override
    public ArrayList<Movie> getAllMovieWhichIncludeActor(int actorId) {
        return this.movieActorDao.getAllMovieWithActor(actorId);
    }

    @Override
    public ArrayList<Movie> getAllMovieByDirector(int directorId) {
        return this.movieDirectorDao.getAllMovieByDirector(directorId);
    }
    
}
