/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.turing.javase7.javase7thbatch.designpattern.observer;

/**
 *
 * @author macbook
 */
public interface Observable {
    void change(String message);
    void add(Observer observer);
    void remove(Observer observer);
}
