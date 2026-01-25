/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.movieapp.dao.impl;

import com.turing.javase7.javase7thbatch.movieapp.dao.DirectorDao;
import com.turing.javase7.javase7thbatch.movieapp.dao.model.Actor;
import com.turing.javase7.javase7thbatch.movieapp.dao.model.Director;
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
public class DirectorDaoImpl extends BaseDao implements DirectorDao{

    @Override
    public ArrayList<Director> getAllDirectors() {
        ArrayList<Director> directors = new ArrayList<>();
        
        String sql = "SELECT * FROM director;";
        
        try(Statement statement = con.createStatement())
        {
            ResultSet resultSet = statement.executeQuery(sql);
            
            while(resultSet.next())
            {
                int id = resultSet.getInt("Id");
                String name = resultSet.getString("name");
                String gender = resultSet.getString("gender");
                String phoneNo = resultSet.getString("phoneNo");//3
               
                directors.add(new Director(id,name,gender,phoneNo));
            }
            resultSet.close();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return directors;
    }

    @Override
    public void saveDirector(Director director) {
        String sql = "INSERT INTO director(name,gender,phoneNo) "
                + "VALUES(?,?,?);";
       
        try( PreparedStatement stmt = con.prepareStatement(sql);)
        {
           stmt.setString(1, director.name());
           stmt.setString(2, director.gender());
           stmt.setString(3, director.phoneNo());
         
            
           stmt.executeUpdate();
           
        } catch (SQLException ex) {
            ex.printStackTrace();
           
        }
    }

    @Override
    public void deleteDirectorById(int id) {
        super.deleteById("director", id);
    }

    @Override
    public void updateDirector(Director director) {
        String sql = "UPDATE director "
                + "SET name =?, gender = ? ,phoneNo=? "
                + "WHERE id=? ";
       
        try( PreparedStatement stmt = con.prepareStatement(sql);)
        {
           stmt.setString(1, director.name());
           stmt.setString(2,director.gender());
           stmt.setString(3,director.phoneNo());
           stmt.setInt(4, director.id());
           
            
           int row = stmt.executeUpdate();
          
        } catch (SQLException ex) {
            ex.printStackTrace();
           
        }
    }

    @Override
    public ArrayList<Director> getAllDirectorsByName(String directorName) {
        ArrayList<Director> directors = new ArrayList<>();
        
        String sql = "SELECT * FROM director WHERE name LIKE '%"+directorName+"%';";
        
        try(Statement statement = con.createStatement())
        {
            ResultSet resultSet = statement.executeQuery(sql);
            
            while(resultSet.next())
            {
                int id = resultSet.getInt("Id");
                String name = resultSet.getString("name");
                String gender = resultSet.getString("gender");
                String phoneNo = resultSet.getString("phoneNo");//3
               
                directors.add(new Director(id,name,gender,phoneNo));
            }
            resultSet.close();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return directors;
    }
    
}
