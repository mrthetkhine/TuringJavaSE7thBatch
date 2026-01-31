/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.designpattern.flyweight;

/**
 *
 * @author macbook
 */
public class DotNetCLR implements Platform {

    DotNetCLR()
    {
        System.out.println("Create DotNet CLR");
    }
    @Override
    public void execute(Code code) {
        System.out.println("Dotnet execute code "+code.getCode());
    }
    
}
