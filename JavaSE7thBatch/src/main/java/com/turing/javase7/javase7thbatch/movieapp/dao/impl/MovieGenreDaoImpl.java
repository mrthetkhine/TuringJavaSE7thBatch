/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.movieapp.dao.impl;

import com.turing.javase7.javase7thbatch.movieapp.dao.MovieGenreDao;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author macbook
 */
public class MovieGenreDaoImpl extends BaseDao implements MovieGenreDao{

    @Override
    public void saveMovieGenre(int movieId, int genreId) {
        String sql = "INSERT INTO movie_genres(movie_id,genre_id) "
                + "VALUES(?,?);";
       
        try( PreparedStatement stmt = con.prepareStatement(sql);)
        {
           stmt.setInt(1, movieId);
           stmt.setInt(2, genreId);
           stmt.executeUpdate();
           
        } catch (SQLException ex) {
            ex.printStackTrace();
           
        }
    }
    
}
