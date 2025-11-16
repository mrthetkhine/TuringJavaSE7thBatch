/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter6;

/**
 *
 * @author macbook
 */
class Book
{
    String title;
    String author;
    float price;
    int quantity;
    
    float getTotal()
    {
        return this.price * this.quantity;
    }
}
public class BookDemo {
    public static void main(String[] args) {
       /* 
       String title = "The Little Book Of Common Sense Investing";
       String author = " John C. Bogle";
       float price = 40;
       
       String title2 = "Atomic Habit";
       String author2 = "Jame Clear";
       float price2 = 20;
       */
       Book book1,book2;
       
       book1 = new Book();
       book1.title = "The Little Book Of Common Sense Investing";
       book1.author = " John C. Bogle";
       book1.price = 40;
       book1.quantity = 2;
       
       
       book2 = new Book();
       book2.title = "Atomic Habit";
       book2.author = "Jame Clear";
       book2.price = 20;
       book2.quantity = 3;
       
       float total = book1.getTotal();
       float total2 = book2.getTotal();
       
       System.out.println("Total "+total);
       System.out.println("Total 2 "+total2);
    }
}
