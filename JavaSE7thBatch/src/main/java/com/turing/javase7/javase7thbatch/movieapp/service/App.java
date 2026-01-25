/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.movieapp.service;

import com.turing.javase7.javase7thbatch.movieapp.service.impl.ActorServiceImpl;
import com.turing.javase7.javase7thbatch.movieapp.service.impl.AuthServiceImpl;
import com.turing.javase7.javase7thbatch.movieapp.service.impl.DirectorServiceImpl;
import com.turing.javase7.javase7thbatch.movieapp.service.impl.GenreServiceImpl;
import com.turing.javase7.javase7thbatch.movieapp.service.impl.MovieServiceImpl;
import com.turing.javase7.javase7thbatch.movieapp.service.impl.RatingServiceImpl;

/**
 *
 * @author macbook
 */
public class App {
    private static App singleton;
    
    MovieService movieService;
    GenreService genreService;
    ActorService actorService;
    DirectorService directorService;
    AuthService authService;
    RatingService ratingService;
    
    private App()
    {
        this.movieService = new MovieServiceImpl();
        this.genreService = new GenreServiceImpl();
        this.actorService = new ActorServiceImpl();
        this.directorService = new DirectorServiceImpl();
        this.authService = new AuthServiceImpl();
        this.ratingService = new RatingServiceImpl();
    }
    public static App getSingleton()
    {
        if(singleton==null)
        {
            singleton = new App();
        }
        return singleton;
    }

    public MovieService getMovieService() {
        return movieService;
    }

    public GenreService getGenreService() {
        return genreService;
    }

    public ActorService getActorService() {
        return actorService;
    }

    public DirectorService getDirectorService() {
        return directorService;
    }

    public AuthService getAuthService() {
        return authService;
    }

    public RatingService getRatingService() {
        return ratingService;
    }
    
}
