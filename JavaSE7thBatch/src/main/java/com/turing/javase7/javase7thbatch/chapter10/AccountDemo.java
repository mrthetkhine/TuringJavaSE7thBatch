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
class FinancialException extends Exception
{
    double amount;
    public FinancialException(String message,double amount)
    {
        super(message);
        this.amount = amount;
    }
}

class InvalidCreditException extends FinancialException
{
    public InvalidCreditException(String message,double amount)
    {
        super(message,amount);
    }
}
class InvalidDebitException extends FinancialException
{
    public InvalidDebitException(String message,double amount)
    {
        super(message,amount);
    }
}
class BankAccount
{
    private double balance;
    
    BankAccount(double balance)
    {
        this.balance = balance;
    }
    void credit(double amount)throws InvalidCreditException
    {
        if(amount >0)
        {
            System.out.println("Credit==> "+amount);
            this.balance += amount;
        }
        else
        {
            throw new InvalidCreditException("Invalid credit ",amount);
        }
        
    }
    void debit(double amount)throws InvalidDebitException
    {
        if(amount>0 && amount <= this.balance)
        {
             System.out.println("Debit==> "+amount);
            this.balance -= amount;
        }
        else
        {
            throw new InvalidDebitException("Invalid debit",amount);
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
            catch(InvalidDebitException |InvalidCreditException e)
            {
                System.out.println("Invalid Debit "+e.getMessage() + " amount "+e.amount);
            }
            /*
            catch(InvalidDebitException e)
            {
                System.out.println("Invalid Debit "+e.getMessage() + " amount "+e.amount);
            }
            catch(InvalidCreditException e)
            {
                System.out.println("InvalidCredit "+e.getMessage() + " amount "+e.amount);
            }*/
            finally
            {
                System.out.println("Balance===>");
                acc.statement();
            }
            
        }while(!ch.equals("q"));
             
        System.out.println("Done");
    }
}
