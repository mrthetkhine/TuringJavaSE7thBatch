/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.movieapp.dao.impl;

import com.turing.javase7.javase7thbatch.movieapp.dao.MovieActorDao;
import com.turing.javase7.javase7thbatch.movieapp.dao.MovieDirectorDao;
import com.turing.javase7.javase7thbatch.movieapp.dao.model.Actor;
import com.turing.javase7.javase7thbatch.movieapp.dao.model.Director;
import com.turing.javase7.javase7thbatch.movieapp.dao.model.Movie;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author macbook
 */
public class MovieDirectorDaoImpl extends BaseDao implements MovieDirectorDao{

    @Override
    public void addDirectorToMovie(int movieId,int directorId){
        String sql = "INSERT INTO movie_directors(movie_id,director_id) "
                + "VALUES(?,?);";
       
        try( PreparedStatement stmt = con.prepareStatement(sql);)
        {
           stmt.setInt(1, movieId);
           stmt.setInt(2, directorId);
           stmt.executeUpdate();
           
        } catch (SQLException ex) {
            ex.printStackTrace();
           
        }
    }

    @Override
    public ArrayList<Director> getAllDirectorForMovie(int movieId) {
        String sql = """
                    SELECT director.* FROM movie_directors,director
                    WHERE movie_directors.director_id = director.id
                    AND movie_directors.movie_id = ?
                     """;
        ArrayList<Director> directors = new ArrayList<>();
        try( PreparedStatement stmt = con.prepareStatement(sql);)
        {
            stmt.setInt(1, movieId);
            ResultSet resultSet = stmt.executeQuery();

           while(resultSet.next())
           {
               int id = resultSet.getInt("Id");
               String name = resultSet.getString("name");
               String gender = resultSet.getString("gender");
               String phoneNo = resultSet.getString("phoneNo");//3

               directors.add(new Director(id,name,gender,phoneNo));
           }
           resultSet.close();
         }
         catch(Exception e)
         {
             e.printStackTrace();
         }
        return directors;
           
    }

    @Override
    public ArrayList<Movie> getAllMovieByDirector(int directorId) {
        ArrayList<Movie> movies = new ArrayList<>();
        
        String sql = """
                     SELECT movie.* FROM movie,movie_directors
                     WHERE movie_directors.director_id = ?
                     AND movie.id = movie_directors.movie_id;
                     """;
        
        try(PreparedStatement statement = con.prepareStatement(sql))
        {
            statement.setInt(1, directorId);
            ResultSet resultSet = statement.executeQuery();
            
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
    
}
