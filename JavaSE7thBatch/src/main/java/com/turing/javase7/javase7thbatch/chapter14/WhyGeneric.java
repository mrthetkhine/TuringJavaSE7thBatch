/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter14;

/**
 *
 * @author macbook
 */
class Box
{
    int value;

    Box(int value)
    {
        this.value = value;
    }
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
}
class StringBox
{
    String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }  
}
class ObjectBox
{
    Object value;

    public ObjectBox(Object value)
    {
        this.value = value;
    }
    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
    
}
public class WhyGeneric {
    public static void main(String[] args) {
        Box box = new Box(10);
        box.setValue(100);
        System.out.println("Box "+box.getValue());
        
        ObjectBox b2 =new ObjectBox(3);
        b2.setValue("Hello");
        
    }
}
