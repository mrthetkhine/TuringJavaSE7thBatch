/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.db;

import java.sql.Connection;

/**
 *
 * @author macbook
 */
public class DaoDemo {
    public static void main(String[] args) {
        DAO dao = DAO.getSingelton();
        
        DAO another = DAO.getSingelton();
        System.out.println("dao == another "+(dao == another));
        
        Connection con = dao.getConnection();
        System.out.println("Con "+con);
    }
}
