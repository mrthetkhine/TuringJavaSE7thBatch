/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.movieapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author macbook
 */
public class BaseDao {
    DAO dao =DAO.getSingelton();
    Connection con = dao.getConnection();
    
    
    public void deleteById(String tableName, int id) {
        String sql = "DELETE FROM "+tableName+" "
                + " WHERE id=? ";
       
        try( PreparedStatement stmt = con.prepareStatement(sql);)
        {
           stmt.setInt(1, id); 
           stmt.executeUpdate();
         
        } catch (SQLException ex) {
            ex.printStackTrace();
           
        }
     
    }
}
