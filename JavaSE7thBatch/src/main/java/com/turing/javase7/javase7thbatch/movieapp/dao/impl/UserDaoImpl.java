/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.movieapp.dao.impl;

import com.turing.javase7.javase7thbatch.movieapp.dao.UserDao;
import com.turing.javase7.javase7thbatch.movieapp.dao.model.Director;
import com.turing.javase7.javase7thbatch.movieapp.dao.model.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

/**
 *
 * @author macbook
 */
public class UserDaoImpl extends BaseDao implements UserDao{

    @Override
    public Optional<User> getUserByUserName(String username) {
        String sql = """
                    SELECT * FROM user WHERE username= ?
                     """;
        User user =null;
        try( PreparedStatement stmt = con.prepareStatement(sql);)
        {
            stmt.setString(1, username);
            ResultSet resultSet = stmt.executeQuery();
            
           while(resultSet.next())
           {
              int id = resultSet.getInt("id");
               String uName = resultSet.getString("username");
               String password = resultSet.getString("password");
              
               user = new User(id,uName,password);
               
           }
           resultSet.close();
         }
         catch(Exception e)
         {
             e.printStackTrace();
         }
        return Optional.ofNullable(user);
    }

    @Override
    public void regsiter(String username, String password) {
         String sql = "INSERT INTO user(username,password) "
                + "VALUES(?, SHA2(?, 256));";
       
        try( PreparedStatement stmt = con.prepareStatement(sql);)
        {
           stmt.setString(1, username);
           stmt.setString(2, password);
           stmt.executeUpdate();
           
        } catch (SQLException ex) {
            ex.printStackTrace();
           
        }
    }
    
    
    @Override
    public void login(String username, String password) {
        String sql = """
                    SELECT * FROM user WHERE username= ?
                     AND password = SHA2(?,256)
                     """;
        User user =null;
        try( PreparedStatement stmt = con.prepareStatement(sql);)
        {
            stmt.setString(1, username);
            stmt.setString(2, password);
            ResultSet resultSet = stmt.executeQuery();
            
           while(resultSet.next())
           {
                int id = resultSet.getInt("id");  
               String uName = resultSet.getString("username");
               String pwd = resultSet.getString("password");
              
               user = new User(id,uName,password);
               
           }
           resultSet.close();
         }
         catch(Exception e)
         {
             e.printStackTrace();
         }
        if(user == null)
        {
            throw new RuntimeException("Invalid login");
        }
    }
    public static void main(String[] args) {
        UserDaoImpl dao = new UserDaoImpl();
        //dao.regsiter("admin", "admin");
        /*
        Optional<User> result = dao.getUserByUserName("admin");
        System.out.println("is PResent "+result.isPresent());
        */
        dao.login("admin", "admin1");
        
    }

}
