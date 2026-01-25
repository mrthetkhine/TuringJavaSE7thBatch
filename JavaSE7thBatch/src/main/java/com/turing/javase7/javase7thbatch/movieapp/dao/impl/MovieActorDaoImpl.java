/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.movieapp.dao.impl;

import com.turing.javase7.javase7thbatch.movieapp.dao.MovieActorDao;
import com.turing.javase7.javase7thbatch.movieapp.dao.model.Actor;
import com.turing.javase7.javase7thbatch.movieapp.dao.model.Movie;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author macbook
 */
public class MovieActorDaoImpl extends BaseDao implements MovieActorDao{

    @Override
    public void addActorToMovie(int movieId, int actorId) {
        String sql = "INSERT INTO movie_actors(movie_id,actor_id) "
                + "VALUES(?,?);";
       
        try( PreparedStatement stmt = con.prepareStatement(sql);)
        {
           stmt.setInt(1, movieId);
           stmt.setInt(2, actorId);
           stmt.executeUpdate();
           
        } catch (SQLException ex) {
            ex.printStackTrace();
           
        }
    }

    @Override
    public ArrayList<Actor> getAllActorForMovie(int movieId) {
        String sql = """
                     SELECT actor.* FROM movie_actors,actor
                     WHERE movie_actors.actor_id = actor.id
                     AND movie_actors.movie_id = ?
                     """;
        ArrayList<Actor> actors = new ArrayList<>();
        try( PreparedStatement stmt = con.prepareStatement(sql);)
        {
            stmt.setInt(1, movieId);
            ResultSet resultSet = stmt.executeQuery();

           while(resultSet.next())
           {
               int id = resultSet.getInt("Id");
               String name = resultSet.getString("name");
               String gender = resultSet.getString("gender");
               Date birthDate = resultSet.getDate("birthday");//3

               actors.add(new Actor(id,name,gender,birthDate));
           }
           resultSet.close();
         }
         catch(Exception e)
         {
             e.printStackTrace();
         }
        return actors;
           
    }

    @Override
    public ArrayList<Movie> getAllMovieWithActor(int actorId) {
        ArrayList<Movie> movies = new ArrayList<>();
        
        String sql = """
                     SELECT movie.* FROM javase_7th.movie_actors,movie
                     WHERE movie_actors.actor_id = ?
                     AND movie.id = movie_actors.movie_id;
                     """;
        
        try(PreparedStatement statement = con.prepareStatement(sql))
        {
            statement.setInt(1, actorId);
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
