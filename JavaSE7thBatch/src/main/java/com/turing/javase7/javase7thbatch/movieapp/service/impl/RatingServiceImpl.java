/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.movieapp.service.impl;

import com.turing.javase7.javase7thbatch.movieapp.dao.RatingDao;
import com.turing.javase7.javase7thbatch.movieapp.dao.impl.RatingDaoImpl;
import com.turing.javase7.javase7thbatch.movieapp.dao.model.Rating;
import com.turing.javase7.javase7thbatch.movieapp.service.RatingService;
import java.util.ArrayList;

/**
 *
 * @author macbook
 */
public class RatingServiceImpl implements RatingService{
    RatingDao dao = new RatingDaoImpl();

    @Override
    public void addRating(int userId, int movieId, int rating) {
        this.dao.addRating(userId, movieId, rating);
    }

    @Override
    public ArrayList<Rating> getAllRatingByUser(int userId) {
        return this.dao.getAllRatingByUser(userId);
    }
    
}
