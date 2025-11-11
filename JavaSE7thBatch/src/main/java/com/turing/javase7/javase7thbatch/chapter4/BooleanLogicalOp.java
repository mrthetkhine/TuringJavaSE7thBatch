/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter4;

/**
 *
 * @author macbook
 */
public class BooleanLogicalOp {
    public static void main(String[] args) {
        /*
        AND
        0 0 => 0
        0 1 => 0
        1 0 => 0
        1 1 => 1
        */
        System.out.println(" false & false =>"+ (false & false));
        System.out.println(" false & true =>"+ (false & true));
        System.out.println(" true & false =>"+ (true & false));
        System.out.println(" true & true =>"+ (true & true));
        
        System.out.println("");
        
        /*
        OR
        0 0 => 0
        0 1 => 1
        1 0 => 1
        1 1 => 1
        */
        System.out.println(" false | false =>"+ (false | false));
        System.out.println(" false | true =>"+ (false | true));
        System.out.println(" true | false =>"+ (true | false));
        System.out.println(" true | true =>"+ (true | true));
        
         /*
        XOR
        0 0 => 0
        0 1 => 1
        1 0 => 1
        1 1 => 0
        */
        System.out.println("");
        System.out.println(" false ^ false =>"+ (false ^ false));
        System.out.println(" false ^ true =>"+ (false ^ true));
        System.out.println(" true ^ false =>"+ (true ^ false));
        System.out.println(" true ^ true =>"+ (true ^ true));
        
    }
}
