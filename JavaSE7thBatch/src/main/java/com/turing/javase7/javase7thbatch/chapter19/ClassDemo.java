/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter19;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 *
 * @author macbook
 */
class MyClass
{
    int x ;
    public MyClass(int x)
    {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    
}
public class ClassDemo {
    public static void main(String[] args) {
        MyClass obj = new MyClass(10);
        Class clazz  = obj.getClass();
        
        Field [] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("Fieldname "+field.getName());
        }
        Method[] methods = clazz.getDeclaredMethods();
        for(Method method : methods)
        {
            System.out.println("Method "+method.getName());
        }
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        System.out.println("Loader "+loader.getName());
    }
}
