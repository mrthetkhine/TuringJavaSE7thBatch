/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter10;

import java.util.Scanner;

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
            System.out.println("Credit==> "+amount);
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
             System.out.println("Debit==> "+amount);
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
public class AccountDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(100);
        acc.statement();
        
        Scanner scanner = new Scanner(System.in);
        
        String ch ;
        do
        {
            System.out.println("Enter credit(c) or debit(d) or quit");
            ch = scanner.next();
            int amount;
            
            try
            {
                if(ch.equals("c"))
                {
                    System.out.println("Enter amount to credit");
                    amount = scanner.nextInt();

                    acc.credit(amount);
                    
                }
                else if(ch.equals("d"))
                {
                    System.out.println("Enter amount to debit");
                    amount = scanner.nextInt();
                    
                    acc.debit(amount);
                    
                }
            }
            catch(Exception e)
            {
                System.out.println("Exception "+e.getMessage());
            }
            finally
            {
                System.out.println("Balance===>");
                acc.statement();
            }
            
        }while(!ch.equals("q"));
             
        System.out.println("Done");
    }
}
