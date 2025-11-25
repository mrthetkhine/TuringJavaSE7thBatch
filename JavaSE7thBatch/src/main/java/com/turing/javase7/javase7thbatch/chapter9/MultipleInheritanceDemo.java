/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter9;

/**
 *
 * @author macbook
 */
interface IOne
{
    void method1();
}
interface ITwo
{
    void method2();
}
interface IThree extends IOne, ITwo
{
    void method3();
}
class Demo implements IThree
{

    @Override
    public void method3() {
        System.out.println("Method 3");
    }

    @Override
    public void method1() {
        System.out.println("Method 1");
    }

    @Override
    public void method2() {
        System.out.println("Method 2");
    }
    
}        
public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        IThree obj = new Demo();
        obj.method1();
        obj.method2();
        obj.method3();
    }
}
