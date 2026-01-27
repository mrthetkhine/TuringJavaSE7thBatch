/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.designpattern.abstractfactory;

/**
 *
 * @author macbook
 */
public class ReportCreator {
    ReportFactory factory;
    public ReportCreator(ReportFactory factory)
    {
        this.factory = factory;
    }
    ReportHeader createHeader()
    {
        return this.factory.createHeader();
    }
    ReportBody createBody()
    {
        return this.factory.createBody();
    }
}
