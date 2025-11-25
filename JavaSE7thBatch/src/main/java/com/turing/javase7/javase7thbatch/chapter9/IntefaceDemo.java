/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter9;

/**
 *
 * @author macbook
 */
interface InterfaceOne
{
    void method1();
          
    int SIZE = 10;
}
interface InterfaceTwo
{
    void method2();
}
class Demo3 implements InterfaceOne,InterfaceTwo
{

    String property1;
    
    @Override
    public void method1() {
        System.out.println("Method1");
    }

    @Override
    public void method2() {
        System.out.println("Method2");
    }
    
}
public class IntefaceDemo {
    public static void main(String[] args) {
        InterfaceOne iOne = new Demo3();
        iOne.method1();
        
        InterfaceTwo iTwo = new Demo3();
        iTwo.method2();
        
        //InterfaceOne.SIZE ++;
    }
}
