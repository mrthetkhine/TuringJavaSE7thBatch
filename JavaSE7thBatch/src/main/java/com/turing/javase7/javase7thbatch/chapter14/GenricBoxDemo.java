/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter14;

/**
 *
 * @author macbook
 */
class GenericBox<T>
{
    T value;//Object value;
    GenericBox(T value)
    {
        this.value = value;
        //new T();
       
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
    
}
public class GenricBoxDemo {
    public static void main(String[] args) {
        GenericBox<Integer> iBox = new GenericBox(20);
        //iBox.setValue("Hello");
        System.out.println("IBox +1 "+iBox.getValue()+1);
        
        GenericBox<String> strBox = new GenericBox("Hello");
        System.out.println("strBox "+strBox.getValue());
        System.out.println("StrBox "+strBox.getValue().getClass());
        System.out.println("StrBox "+strBox.getClass());
         
        //Generic<int>
        GenericBox box = new GenericBox(10);
        System.out.println("Box "+box.getValue().getClass());
        
        //strBox = iBox;
    }
}
