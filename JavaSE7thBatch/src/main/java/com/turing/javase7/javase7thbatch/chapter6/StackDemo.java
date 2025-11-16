/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter6;

/**
 *
 * @author macbook
 */
class Stack
{
    int items[] = new int[10];
    int top = -1;
    
    void push(int data)
    {
        this.items [++this.top] = data;
    }
    int pop()
    {
        return this.items[this.top--];
    }
}
public class StackDemo {
    public static void main(String[] args) {
        Stack stack = new Stack();
        
        stack.push(10);
        stack.push(5);
        
        System.out.println("Pop "+stack.pop());
        System.out.println("Pop "+stack.pop());
        
        Stack stack1 = new Stack();
        stack1.push(100);
        stack1.push(10);
        stack1.push(30);
        
        System.out.println("Stack1 pop "+stack1.pop());
    }
}
