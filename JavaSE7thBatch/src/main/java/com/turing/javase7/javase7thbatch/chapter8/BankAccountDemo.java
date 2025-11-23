/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter8;

/**
 *
 * @author macbook
 */
class BankAccount
{
    private double balance;
    
    BankAccount(double balance)
    {
        this.balance = balance;
    }
    void credit(double amount)
    {
        if(amount >0)
        {
            this.balance += amount;
        }
        else
        {
            throw new RuntimeException("Invalid credit");
        }
        
    }
    void debit(double amount)
    {
        if(amount>0 && amount <= this.balance)
        {
            this.balance -= amount;
        }
        else
        {
            throw new RuntimeException("Invalid debit");
        }
        
    }
    void statement()
    {
        System.out.println("Balance is "+this.balance);
    }
}
public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(100);
        
        //acc.balance= 100;
        
        acc.credit(200);
        acc.statement();
        
        //acc.debit(-200);
        acc.debit(200);
        acc.statement();
        
    }
}
