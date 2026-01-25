/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.turing.javase7.javase7thbatch.movieapp.dao;

import com.turing.javase7.javase7thbatch.movieapp.dao.model.Actor;
import com.turing.javase7.javase7thbatch.movieapp.dao.model.Movie;
import java.util.ArrayList;

/**
 *
 * @author macbook
 */
public interface MovieActorDao {
    void addActorToMovie(int movieId,int actorId);
    ArrayList<Actor> getAllActorForMovie(int movieId);
    ArrayList<Movie> getAllMovieWithActor(int actorId);
}
