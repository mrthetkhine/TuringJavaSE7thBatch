/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.movieapp.dao.impl;

import com.turing.javase7.javase7thbatch.movieapp.dao.RatingDao;
import com.turing.javase7.javase7thbatch.movieapp.dao.model.Actor;
import com.turing.javase7.javase7thbatch.movieapp.dao.model.Rating;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author macbook
 */
public class RatingDaoImpl extends BaseDao implements RatingDao{

    @Override
    public void addRating(int userId, int movieId, int rating) {
        String sql = "INSERT INTO rating(user_id,movie_id,rating) "
                + "VALUES(?,?,?);";
       
        try( PreparedStatement stmt = con.prepareStatement(sql);)
        {
           stmt.setInt(1, userId);
           stmt.setInt(2, movieId);
           stmt.setInt(3, rating);
           stmt.executeUpdate();
           
        } catch (SQLException ex) {
            ex.printStackTrace();
           
        }
    }

    @Override
    public ArrayList<Rating> getAllRatingByUser(int userId) {
         String sql = """
                     SELECT * FROM rating
                     WHERE user_id=?
                     """;
        ArrayList<Rating> ratings = new ArrayList<>();
        try( PreparedStatement stmt = con.prepareStatement(sql);)
        {
            stmt.setInt(1, userId);
            ResultSet resultSet = stmt.executeQuery();

           while(resultSet.next())
           {
               int id = resultSet.getInt("Id");
               
               int movieId = resultSet.getInt("movie_id");
               int rating = resultSet.getInt("rating");

               ratings.add(new Rating(id,userId,movieId,rating));
           }
           resultSet.close();
         }
         catch(Exception e)
         {
             e.printStackTrace();
         }
        return ratings;
    }
    
}
