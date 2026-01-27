/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.designpattern.factory;

/**
 *
 * @author macbook
 */
public class FactoryDemo {
    public static void main(String[] args) {
        ConnectionFactory factory = new MySQLConnectionFactory();
        //factory = new OracleConnectionFactory();
        
        DBConnection db = new DBConnection(factory);
        Connection conn = db.getConnection();
        
        conn.open();
        conn.close();
    }
}
