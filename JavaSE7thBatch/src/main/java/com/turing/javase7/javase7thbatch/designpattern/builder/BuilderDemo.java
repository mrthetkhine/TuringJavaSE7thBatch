/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.designpattern.builder;

import java.util.concurrent.Executors;

/**
 *
 * @author macbook
 */
public class BuilderDemo {
    public static void main(String[] args) {
        var txt = new Text.Builder()
                        .label("Test")
                        .font("Something")
                        .build();
        System.out.println("Text "+txt);
        //Executors.newCachedThreadPool();
    }
}
