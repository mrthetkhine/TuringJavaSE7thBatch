/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter22;

import java.io.File;

/**
 *
 * @author macbook
 */
public class CreateDir {
    public static void main(String[] args) {
        File file = new File("./temp");
        file.mkdir();
    }
}
