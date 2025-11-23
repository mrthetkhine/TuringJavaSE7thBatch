/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter8;

/**
 *
 * @author macbook
 */
class Parent
{
    private String phone;
    String car;
    
    public Parent(String phone , String car)
    {
        this.phone = phone;
        this.car = car;
    }
    void show()
    {
        System.out.println("Phone "+this.phone);
        System.out.println("Car "+this.car);
    }
}
class Child extends Parent
{
    String computer;
    
    Child(String phone,String car,String computer)
    {
        super(phone,car);
        //this.car = car;
        this.computer =computer;
    }
    void drive()
    {
        System.out.println("Driving car "+this.car);
    }
    void show()
    {
        super.show();
        //this.phone ="Update";
        System.out.println("I have computer "+this.computer);
    }
}

public class MemberAccessDemo {
    public static void main(String[] args) {
        Parent ch = new Child("iPhone","Lexus","Mac");
        //ch.drive();
        ch.show();
    }
}
