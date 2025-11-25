/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter9;

import com.turing.javase7.javase7thbatch.chapter8.Avenger;

/**
 *
 * @author macbook
 */
class GoldLikeAvenger extends Avenger
{
    public GoldLikeAvenger(String power)
    {
        super(power);
    }
    void showPower()
    {
        System.out.println("Power is "+this.power);
        //System.out.println("Anothepower "+this.anotherPower);
                
    }
}
public class ProtectedDemo {
    public static void main(String[] args) {
        GoldLikeAvenger avenger = new GoldLikeAvenger("Thunder");
        avenger.showPower();
    }
}
