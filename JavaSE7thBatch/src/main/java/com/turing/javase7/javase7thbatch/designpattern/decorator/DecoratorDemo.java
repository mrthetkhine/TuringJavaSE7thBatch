/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.designpattern.decorator;

/**
 *
 * @author macbook
 */
public class DecoratorDemo {
    public static void main(String[] args) {
        Logger logger = new HtmlDecorator((new BasicLogger()));
        
        System.out.println(logger.log("hello"));
    }
}
