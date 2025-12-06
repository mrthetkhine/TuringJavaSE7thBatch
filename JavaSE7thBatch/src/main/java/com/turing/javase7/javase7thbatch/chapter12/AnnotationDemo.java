/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter12;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

/**
 *
 * @author macbook
 */
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno
{
    String message();
}
class AnnoDemo
{
    @MyAnno(message="method1 message")
    void method()
    {
        System.out.println("Methodof Anno Demo");
    }
    void method2()
    {
        System.out.println("Methodof Anno Demo2");
    }
}
public class AnnotationDemo {
    public static void main(String[] args) {
        AnnoDemo obj = new AnnoDemo();
        Class clazz = obj.getClass();
        System.out.println("Clazz "+clazz.getName());
        
        Method[]methods = clazz.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println("Name "+m.getName());
            
            Annotation anno [] = m.getDeclaredAnnotations();
            for(Annotation an : anno)
            {
                System.out.println("An "+an);
            }
        }
    }
}
