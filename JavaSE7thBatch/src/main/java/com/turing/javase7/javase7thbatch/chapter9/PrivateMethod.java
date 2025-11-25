/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter9;

/**
 *
 * @author macbook
 */
interface IWithPrivateMethod
{
    default void doSomething()
    {
        this.something();
    }
    private void something()
    {
        System.out.println("Something");
    }
}
class DemoTwo implements IWithPrivateMethod
{
}
public class PrivateMethod {
    public static void main(String[] args) {
        IWithPrivateMethod priv = new DemoTwo();
        priv.doSomething();
    }
}
