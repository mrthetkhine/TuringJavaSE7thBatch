/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter12;

/**
 *
 * @author macbook
 */
enum Gender
{
    Male,
    Female
}
public class WhyEnum {
    public static void main(String[] args) {
        /*
        int gender = 0;//male
        gender = 1;
        
        System.out.println("Gender "+gender);
        */
        Gender gender = Gender.Male;
        System.out.println("Gender "+gender);
        
        gender = Gender.Female;
        System.out.println("Gender "+gender);
        
        //gender = 100;
        Gender[] genders = Gender.values();
        for(Gender g : genders)
        {
            System.out.println("Gender g "+g);
        }
        
        Gender g = Gender.valueOf("Male");
        System.out.println("G "+g);
    }
}
