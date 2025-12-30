/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter24;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
public class InetAddressDemo {
    public static void main(String[] args) {
        try {
            InetAddress[] addresses = InetAddress.getAllByName("google.com");
            for(InetAddress add : addresses)
            {
                System.out.println("Add "+add);
            }
            InetAddress localhost = InetAddress.getLocalHost();
            InetAddress fb = InetAddress.getByName("facebook.com");
            System.out.println("LocalHost "+localhost);
            System.out.println("FB "+fb);
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        }
        
    }
}
