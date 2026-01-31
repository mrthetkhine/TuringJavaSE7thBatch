/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.designpattern.decorator;

import java.util.Date;

/**
 *
 * @author macbook
 */
public class HtmlDecorator implements Logger{

    Logger logger;
    HtmlDecorator(Logger logger)
    {
        this.logger =logger;
    }
    @Override
    public String log(String message) {
        return "<html>"+ logger.log(message)+"</html>";
    }
    
}
