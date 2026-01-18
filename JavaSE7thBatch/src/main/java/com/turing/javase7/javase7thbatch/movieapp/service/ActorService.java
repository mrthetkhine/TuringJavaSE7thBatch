/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.turing.javase7.javase7thbatch.movieapp.service;

import com.turing.javase7.javase7thbatch.movieapp.dao.model.Actor;
import java.util.ArrayList;

/**
 *
 * @author macbook
 */
public interface ActorService {
    ArrayList<Actor> getAllActors();
    void saveActor(Actor actor);
    void deleteActorById(int id);
    void updateActor(Actor actor);
}
