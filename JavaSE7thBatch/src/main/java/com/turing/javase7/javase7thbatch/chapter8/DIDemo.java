/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter8;

/**
 *
 * @author macbook
 */
class Engine
{
    void start()
    {
        System.out.println("Engine start");
    }
}
class ElectricEngine extends Engine
{
    void start()
    {
        System.out.println("ElectricEngine start");
    }
}
class CngEngine extends Engine
{
    void start()
    {
        System.out.println("CngEngine start");
    }
}
class Car
{
    Engine engine;
    
    Car(Engine engine)
    {
        this.engine = engine;
    }
    void start()
    {
        System.out.println("Car start");
        this.engine.start();
    }
}
public class DIDemo {
    public static void main(String[] args) {
        Engine engine = new CngEngine();
        Car car = new Car(engine);
        
        car.start();
    }
    
}
