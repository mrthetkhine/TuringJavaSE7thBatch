/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.movieapp.dao.impl;

import com.turing.javase7.javase7thbatch.db.model.Item;
import com.turing.javase7.javase7thbatch.movieapp.dao.MovieDao;
import com.turing.javase7.javase7thbatch.movieapp.dao.model.Movie;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author macbook
 */
public class MovieDaoImpl extends BaseDao implements MovieDao 
{ 
    
    @Override
    public ArrayList<Movie> getAllMovie() {
        ArrayList<Movie> movies = new ArrayList<>();
        
        String sql = "SELECT * FROM movie;";
        
        try(Statement statement = con.createStatement())
        {
            ResultSet resultSet = statement.executeQuery(sql);
            
            while(resultSet.next())
            {
                int id = resultSet.getInt("Id");
                String title = resultSet.getString("title");
                int year = resultSet.getInt("year");//3
               
                movies.add(new Movie(id,title,year));
            }
            resultSet.close();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return movies;
    }

    @Override
    public void addMovie(Movie movie) {
         String sql = "INSERT INTO movie(title,year) "
                + "VALUES(?,?);";
       
        try( PreparedStatement stmt = con.prepareStatement(sql);)
        {
           stmt.setString(1, movie.title());
           stmt.setInt(2,movie.year());
         
            
           stmt.executeUpdate();
           
        } catch (SQLException ex) {
            ex.printStackTrace();
           
        }
       
    }

    @Override
    public void deleteMovieById(int id) {
        super.deleteById("movie", id);
     
    }

    @Override
    public void updateMovie(Movie movie) {
        String sql = "UPDATE movie "
                + "SET title =?, year = ?  "
                + "WHERE id=? ";
       
        try( PreparedStatement stmt = con.prepareStatement(sql);)
        {
           stmt.setString(1, movie.title());
           stmt.setInt(2,movie.year());
           stmt.setInt(3, movie.id());
           
            
           int row = stmt.executeUpdate();
          
        } catch (SQLException ex) {
            ex.printStackTrace();
           
        }
    }
    
}
