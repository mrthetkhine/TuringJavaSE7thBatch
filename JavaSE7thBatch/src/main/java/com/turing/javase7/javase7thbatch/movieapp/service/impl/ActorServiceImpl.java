/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.movieapp.service.impl;

import com.turing.javase7.javase7thbatch.movieapp.dao.ActorDao;
import com.turing.javase7.javase7thbatch.movieapp.dao.impl.ActorDaoImpl;
import com.turing.javase7.javase7thbatch.movieapp.dao.model.Actor;
import com.turing.javase7.javase7thbatch.movieapp.service.ActorService;
import java.util.ArrayList;

/**
 *
 * @author macbook
 */
public class ActorServiceImpl implements ActorService{

    ActorDao dao = new ActorDaoImpl();
    
    @Override
    public ArrayList<Actor> getAllActors() {
        return this.dao.getAllActors();
    }
    @Override
    public ArrayList<Actor> getAllActorsByName(String name) {
        return this.dao.getAllActorsByName(name);
    }
    @Override
    public void saveActor(Actor actor) {
        this.dao.saveActor(actor);
    }

    @Override
    public void deleteActorById(int id) {
        this.dao.deleteActorById(id);
    }

    @Override
    public void updateActor(Actor actor) {
        this.dao.updateActor(actor);
    }

    
    
}
