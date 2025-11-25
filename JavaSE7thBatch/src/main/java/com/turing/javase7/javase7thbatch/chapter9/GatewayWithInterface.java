/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter9;

/**
 *
 * @author macbook
 */
interface Gateway
{
    void processPayment();
}
interface MpuGateway extends Gateway
{
    void processMpu();
}
class KBZGateway implements Gateway
{

    @Override
    public void processPayment() {
        System.out.println("KBZ Gateway processing payment");
    }
    
}
class YomaGateway implements MpuGateway
{

    @Override
    public void processPayment() {
        System.out.println("Yoma Gateway processing payment");
    }

    @Override
    public void processMpu() {
        System.out.println("Process MPU");
    }
}
public class GatewayWithInterface {
    public static void main(String[] args) {
        Gateway gateway = new KBZGateway();
        gateway.processPayment();
        
        MpuGateway mpu = new YomaGateway();
        mpu.processPayment();
        mpu.processMpu();
        
    }
}
