/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter15;

/**
 *
 * @author macbook
 */
interface ArithOp
{
    int op(int a, int b);
   
}
public class ArithOpDemo {
    static void invoke(ArithOp arith,int x, int y)
    {
        System.out.println("Invoke ");
        System.out.println("Result "+ arith.op(x, y));
    }
    static ArithOp getFun()
    {
        return (x,y)-> (int)Math.pow(x, y);
    }
    public static void main(String[] args) {
        ArithOp arith = (x,y)->{
            System.out.println("Addition x "+x + " y "+y);  
            return x+y;
        };
        
        invoke(arith,4,5);
        invoke((int x,int y)->{
            System.out.println("Dynamic lambad function");
            return x + y;
        },10,2);
        
        System.out.println("GetFun "+getFun().op(10, 2));
        
        System.out.println("Add "+arith.op(10,2));
        
        arith = (x,y)-> x-y;
        System.out.println("Sub "+arith.op(10,2));
        
        arith = (x,y)-> x*y;
        System.out.println("Mul "+arith.op(10,2));
        
        arith = (x,y)-> x/y;
        System.out.println("Div "+arith.op(10,2));
    }
}
