/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.movieapp.service;

import com.turing.javase7.javase7thbatch.movieapp.service.impl.ActorServiceImpl;
import com.turing.javase7.javase7thbatch.movieapp.service.impl.GenreServiceImpl;
import com.turing.javase7.javase7thbatch.movieapp.service.impl.MovieServiceImpl;

/**
 *
 * @author macbook
 */
public class App {
    private static App singleton;
    
    MovieService movieService;
    GenreService genreService;
    ActorService actorService;
    
    private App()
    {
        this.movieService = new MovieServiceImpl();
        this.genreService = new GenreServiceImpl();
        this.actorService = new ActorServiceImpl();
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
    
}
