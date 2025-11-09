/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter3;

/**
 *
 * @author macbook
 */
public class TwoDimensionalArray {
    public static void main(String[] args) {
        /*
        int row0[] = {1,2,3};
        int row1[] = {4,5,6};
        int row2[] = {78,9};
        */
        int matrix[][] = {
            {1,2,3,100,200},
            {4,5,6},
            {7,8,9}
        };
        matrix[1][1] = 50;
        System.out.println("Matrix. length "+matrix.length);
        System.out.println("Matrix [0][1] "+matrix[0][1]);
        System.out.println("Matrix [1][1] "+matrix[1][1]);
        
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("Matrix ["+i +"] "+matrix[i].length);
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Matrix "+matrix[i][j]);
            }
        }
    }
}
