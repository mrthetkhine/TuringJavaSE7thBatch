/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter4;

/**
 *
 * @author macbook
 */
public class ShortCicruitOr {
    
    static boolean getTrue()
    {
        System.out.println("Get True");
        return true;
    }
    static boolean getFalse()
    {
        System.out.println("Get False");
        return false;
    }
    
    public static void main(String[] args) {
        /*
        AND
        0 0 => 0
        0 1 => 0
        1 0 => 0
        1 1 => 1
        */
        System.out.println(" false && false =>"+ (false && false));
        System.out.println(" false && true =>"+ (false && true));
        System.out.println(" true && false =>"+ (true && false));
        System.out.println(" true && true =>"+ (true && true));
        
        System.out.println("");
        
        /*
        OR
        0 0 => 0
        0 1 => 1
        1 0 => 1
        1 1 => 1
        */
        System.out.println(" false || false =>"+ (false || false));
        System.out.println(" false || true =>"+ (false || true));
        System.out.println(" true || false =>"+ (true || false));
        System.out.println(" true || true =>"+ (true || true));
        
        //System.out.println(getTrue());
        //System.out.println(getFalse());
        
        //System.out.println("getFalse() & getTrue() "+(getFalse() & getTrue()));
        //System.out.println("getFalse() && getTrue() "+(getFalse() && getTrue()));
        
        //System.out.println("getTrue() | getTrue() "+(getTrue() | getTrue()));
        System.out.println("getTrue() || getTrue() "+(getTrue() || getTrue()));
        
        System.out.println("");
        System.out.println("!true "+(!true));
        System.out.println("!false "+(!false));
    }
}
