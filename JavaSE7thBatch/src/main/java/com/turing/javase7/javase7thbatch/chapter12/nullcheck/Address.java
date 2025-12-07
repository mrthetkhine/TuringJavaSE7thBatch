/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter12.nullcheck;

/**
 *
 * @author macbook
 */
public class Address {
    @NotNull(message="City should not be null")
    String city;
    
    @NotNull(message="Township should not be null")
    String township;
    
    public Address(String city,String township)
    {
        this.city = city;
        this.township = township;
    }
}
