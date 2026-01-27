/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.designpattern.singleton;

import java.awt.Toolkit;

/**
 *
 * @author macbook
 */
public class SingletonDemo {
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        System.out.println("obj==obj2 "+(obj==obj2));
        
        Toolkit.getDefaultToolkit();
        Runtime.getRuntime();
    }
}
