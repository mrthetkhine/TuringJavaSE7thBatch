/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.turing.javase7.javase7thbatch.movieapp.service;

import com.turing.javase7.javase7thbatch.movieapp.dao.model.Rating;
import java.util.ArrayList;

/**
 *
 * @author macbook
 */
public interface RatingService {
    void addRating(int userId,int movieId, int rating);
    ArrayList<Rating> getAllRatingByUser(int userId);
}
