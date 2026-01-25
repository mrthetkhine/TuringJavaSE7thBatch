/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.movieapp.dao.impl;

import com.turing.javase7.javase7thbatch.movieapp.dao.ActorDao;
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
public class ActorDaoImpl extends BaseDao implements ActorDao{

    @Override
    public ArrayList<Actor> getAllActors() {
        ArrayList<Actor> actors = new ArrayList<>();
        
        String sql = "SELECT * FROM actor;";
        
        try(Statement statement = con.createStatement())
        {
            ResultSet resultSet = statement.executeQuery(sql);
            
            while(resultSet.next())
            {
                int id = resultSet.getInt("Id");
                String name = resultSet.getString("name");
                String gender = resultSet.getString("gender");
                Date birthDate = resultSet.getDate("birthday");//3
               
                actors.add(new Actor(id,name,gender,birthDate));
            }
            resultSet.close();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return actors;
    }
    @Override
    public ArrayList<Actor> getAllActorsByName(String actorName) {
        ArrayList<Actor> actors = new ArrayList<>();
        
        String sql = "SELECT * FROM actor WHERE name LIKE '%"+actorName+"%'";
        
        try(Statement statement = con.createStatement())
        {
            ResultSet resultSet = statement.executeQuery(sql);
            
            while(resultSet.next())
            {
                int id = resultSet.getInt("Id");
                String name = resultSet.getString("name");
                String gender = resultSet.getString("gender");
                Date birthDate = resultSet.getDate("birthday");//3
               
                actors.add(new Actor(id,name,gender,birthDate));
            }
            resultSet.close();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return actors;
    }
    @Override
    public void saveActor(Actor actor) {
        String sql = "INSERT INTO actor(name,gender,birthday) "
                + "VALUES(?,?,?);";
       
        try( PreparedStatement stmt = con.prepareStatement(sql);)
        {
           stmt.setString(1, actor.name());
           stmt.setString(2, actor.gender());
           stmt.setDate(3, new java.sql.Date(actor.dateOfBirth().getTime()));
         
            
           stmt.executeUpdate();
           
        } catch (SQLException ex) {
            ex.printStackTrace();
           
        }
    }

    @Override
    public void deleteActorById(int id) {
        super.deleteById("actor", id);
    }

    @Override
    public void updateActor(Actor actor) {
        String sql = "UPDATE actor "
                + "SET name =?, gender = ? ,birthday=? "
                + "WHERE id=? ";
       
        try( PreparedStatement stmt = con.prepareStatement(sql);)
        {
           stmt.setString(1, actor.name());
           stmt.setString(2,actor.gender());
           stmt.setDate(3,new java.sql.Date(actor.dateOfBirth().getTime()));
           stmt.setInt(4, actor.id());
           
            
           int row = stmt.executeUpdate();
          
        } catch (SQLException ex) {
            ex.printStackTrace();
           
        }
    }

   
    
}
