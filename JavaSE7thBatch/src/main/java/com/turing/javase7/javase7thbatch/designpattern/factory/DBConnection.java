/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.designpattern.factory;

/**
 *
 * @author macbook
 */
public class DBConnection {
    
    ConnectionFactory factory;
    
    public DBConnection(ConnectionFactory factory)
    {
        this.factory = factory;
    }
    Connection getConnection()
    {
        return this.factory.create();
    }
}
