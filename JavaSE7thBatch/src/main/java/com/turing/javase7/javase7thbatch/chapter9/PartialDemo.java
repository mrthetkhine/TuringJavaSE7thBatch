/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter9;

/**
 *
 * @author macbook
 */
interface Callback
{
    public void callback(String message);
    void another();
}
abstract class MyClass implements Callback
{
    @Override
    public void another()
    {
        System.out.println("Another");
    }
}
public class PartialDemo {
    public static void main(String[] args) {
        
    }
}
