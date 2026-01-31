/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.designpattern.flyweight;

import java.util.HashMap;

/**
 *
 * @author macbook
 */
public class PlatformFlyweight {
    static HashMap<String,Platform> platforms= new HashMap<>();
    /*
    static Platform getPlatform(String platformType)
    {
        if(platformType.equals("DotNet"))
        {
            return new DotNetCLR();
        }
        else if(platformType.equals("Java"))
        {
            return new JVM();
        }
        
    }
    */
    static Platform getPlatform(String platformType)
    {
        Platform p = platforms.get(platformType);
        if(p==null)
        {
            if(platformType.equals("DotNet"))
            {
                p =  new DotNetCLR();
            }
            else if(platformType.equals("Java"))
            {
                p =  new JVM();
            }
            platforms.put(platformType, p);
        }
        return p;
        
    }
}
