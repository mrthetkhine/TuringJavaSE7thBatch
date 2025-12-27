/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter21;

import java.util.Optional;

/**
 *
 * @author macbook
 */
public class WhyOptional {
    static String toUpperAppendHi(String input)
    {
        System.out.println("toUpperAppendHi inovked ");
        return input.toUpperCase() +" hi";
    }
    static int getLength(String input)
    {
        System.out.println("getLength inovked ");
        return input.length();
    }
    public static void main(String[] args) {
        String data = null;
        //System.out.println("ToUpper "+getLength(toUpperAppendHi(data)));
        Optional<String> optional = Optional.ofNullable(data);
        optional = Optional.empty();
        optional.map(WhyOptional::toUpperAppendHi)
                .map(WhyOptional::getLength)
                .ifPresentOrElse(result->System.out.println("Result "+result),()->{
                    System.out.println("No result");
                });
        /*
        if(result.isPresent())
        {
            System.out.println("Result "+result.get());
        }
        else
        {
            System.out.println("No data");
        }
        */
        
        Optional.ofNullable(data)
                //.orElse("Default")
                //.or(()->Optional.of("Default"))
                .map(WhyOptional::toUpperAppendHi)
                 .ifPresentOrElse(result->System.out.println("Result2 "+result),()->{
                    System.out.println("No result2");
                });
        String data2 = null;
        String result = Optional.ofNullable(data2)
                                 .map(WhyOptional::toUpperAppendHi)
                                 .orElse("Default value");
        System.out.println("Result "+result);
                    
    }
}
