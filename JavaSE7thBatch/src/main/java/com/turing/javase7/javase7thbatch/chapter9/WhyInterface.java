/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter9;

/**
 *
 * @author macbook
 */
interface Flyable
{
    void fly();
}
class Bird implements Flyable
{

    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }
    
}
class Aeroplane implements Flyable
{

    @Override
    public void fly() {
        System.out.println("Aeroplane is flying");
    }
    
}
public class WhyInterface {
    public static void main(String[] args) {
        Flyable flyable = new Bird();
        flyable.fly();
        
        flyable = new Aeroplane();
        flyable.fly();
    }
}
