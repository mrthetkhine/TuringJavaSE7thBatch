/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter10;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
public class CheckedExceptionDemo {
    public static void main(String[] args) {
        try {
            BankAccount acc = new BankAccount(100);
            acc.statement();
            
            acc.debit(-200);
        } catch (InvalidDebitException ex) {
            Logger.getLogger(CheckedExceptionDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
