/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter8;

/**
 *
 * @author macbook
 */
abstract class Gateway
{
    abstract void payment();
    void normal()
    {
        System.out.println("Normal");
    }
}
class KBZGateway extends Gateway
{
    void payment()
    {
        System.out.println("KBZ Gateway Process ");
    }
}
class AyaGateway extends Gateway
{
    void payment()
    {
        System.out.println("Aya Gateway Process ");
    }
}
class YomaGateway extends Gateway
{
    void payment()
    {
        System.out.println("Yoma Gateway Process ");
    }
}
public class GatewayDemo {
    public static void main(String[] args) {
        Gateway gw = new YomaGateway();
        
        gw = new KBZGateway();
        gw.payment();
        
        gw.normal();
    }
}
