/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter17;

/**
 *
 * @author macbook
 */
sealed class Parent permits Alpha,Beta
{
    String name;
    Parent(String name)
    {
        this.name = name;
        System.out.println("Parent constructor");
    }
}
sealed interface Vip permits Alpha
{
    void doSomething();
}
final class Alpha extends Parent implements Vip
{
    public Alpha(String name)
    {
        super(name);
    }

    @Override
    public void doSomething() {
        System.out.println("Do Some thing");
    }
}
final class Beta extends Parent
{
    public Beta(String name)
    {
        super(name);
    }
}
/*
class Another extends Parent
{
}
*/
public class SealedClassDemo {
    public static void main(String[] args) {
        Parent p = new Alpha("Hi from Alpha");
        System.out.println("P "+p.name);
        
        p = new Beta("hi from beta");
        System.out.println("P "+p.name);
        
        Vip vip = new Alpha("Hi from Alpha");
        vip.doSomething();
    }
}
