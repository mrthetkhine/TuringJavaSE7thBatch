/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.movieapp.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
public class DAO {
    private Connection conn;
    private static DAO singleton;
    
    static
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
     
    private DAO()
    {
        try 
        {
            this.conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/javase_7th",
                       "root", "Root@3421C");
        } 
        catch (SQLException ex) 
        {
            ex.printStackTrace();
            System.out.println("Exception "+ex.getMessage());
        }
    }

    public static DAO getSingelton()
    {
        if(singleton ==null)
        {
            singleton = new DAO();
        }
        return singleton;
    }
    public Connection getConnection() {
        return conn;
    }

   
}
