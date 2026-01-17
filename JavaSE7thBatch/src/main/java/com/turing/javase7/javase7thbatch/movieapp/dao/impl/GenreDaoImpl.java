/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.movieapp.dao.impl;

import com.turing.javase7.javase7thbatch.movieapp.dao.GenreDao;
import com.turing.javase7.javase7thbatch.movieapp.dao.model.Genre;
import com.turing.javase7.javase7thbatch.movieapp.dao.model.Movie;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author macbook
 */
public class GenreDaoImpl extends BaseDao implements GenreDao{

    @Override
    public ArrayList<Genre> getAllGenre() {
        ArrayList<Genre> genres = new ArrayList<>();
        
        String sql = "SELECT * FROM genre;";
        
        try(Statement statement = con.createStatement())
        {
            ResultSet resultSet = statement.executeQuery(sql);
            
            while(resultSet.next())
            {
                int id = resultSet.getInt("Id");
                String name = resultSet.getString("name");
                
               
                genres.add(new Genre(id,name));
            }
            resultSet.close();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return genres;
    }

    @Override
    public void addGenre(String name) {
        String sql = "INSERT INTO genre(name) "
                + "VALUES(?);";
       
        try( PreparedStatement stmt = con.prepareStatement(sql);)
        {
           stmt.setString(1, name);
           stmt.executeUpdate();
           
        } catch (SQLException ex) {
            ex.printStackTrace();
           
        }
    }

    @Override
    public void deleteGenreById(int id) {
        super.deleteById("genre", id);
    }

    @Override
    public void updateGenere(Genre genre) {
        String sql = "UPDATE genre "
                + "SET name =? "
                + "WHERE id=? ";
       
        try( PreparedStatement stmt = con.prepareStatement(sql);)
        {
           stmt.setString(1, genre.name());
           stmt.setInt(2,genre.id());
           
           
            
           int row = stmt.executeUpdate();
          
        } catch (SQLException ex) {
            ex.printStackTrace();
           
        }
    }
    
}
