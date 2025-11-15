/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter5;

/**
 *
 * @author macbook
 */
public class ConditionControl {
    public static void main(String[] args) {
        int[]arr = {1,10,2,5,14,31};
        
        int ele = 20;
        boolean found = false;
        
        int i=0;
        
        while(!found && i < arr.length)
        {
            System.out.println("Check  value "+arr[i]+" with "+ele);
            if(arr[i]==ele)
            {
                found = true;
                System.out.println("Found at index "+i);
            }
            i++;
        }
        if(!found)
        {
            System.out.println("Element not found");
        }
       
    }
}
