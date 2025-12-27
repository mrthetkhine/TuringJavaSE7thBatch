/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter21;

import java.util.Currency;
import java.util.Locale;

/**
 *
 * @author macbook
 */
public class CurrencyDemo {
    public static void main(String[] args) {
        Currency currency = Currency.getInstance(Locale.US);
        System.out.println("Currency "+currency);
        System.out.println("Default digit "+currency.getDefaultFractionDigits());
    }
}
