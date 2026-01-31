/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.designpattern.decorator;

/**
 *
 * @author macbook
 */
public class BasicLogger implements Logger{

    @Override
    public String log(String message) {
        return message;
    }
    
}
