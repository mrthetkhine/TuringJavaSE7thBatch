/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter19;

/**
 *
 * @author macbook
 */
public class EnvProp {
    public static void main(String[] args) {
        System.out.println("home "+System.getProperty("user.home"));
        System.out.println("file separator "+System.getProperty("file.separator"));
        System.out.println("java.home "+System.getProperty("java.home"));
        System.out.println("java.version "+System.getProperty("java.version"));
        System.out.println("os.name "+System.getProperty("os.name"));
        System.out.println("os.arch "+System.getProperty("os.arch"));
    }
}
