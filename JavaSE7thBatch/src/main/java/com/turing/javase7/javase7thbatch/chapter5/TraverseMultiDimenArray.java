/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter5;

/**
 *
 * @author macbook
 */
public class TraverseMultiDimenArray {
    public static void main(String[] args) {
        int[][]matrix = {
            {1,2,3},
            {4,5,6,7},
            {8,9},
        };
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Matrix ["+i+"]["+j+"] "+ matrix[i][j]);
            }
        }
        for(var row :matrix)
        {
            for(var ele : row)
            {
                System.out.print(ele + " ");
            }
            System.out.println("");
        }
    }
}
