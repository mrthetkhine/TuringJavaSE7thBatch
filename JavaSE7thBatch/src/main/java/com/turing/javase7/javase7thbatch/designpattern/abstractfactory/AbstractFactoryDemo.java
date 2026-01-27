/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.designpattern.abstractfactory;

/**
 *
 * @author macbook
 */
public class AbstractFactoryDemo {
    public static void main(String[] args) {
        ReportFactory factory = new XMLReportFactory();
        ReportCreator creator = new ReportCreator(factory);
        ReportHeader header =creator.createHeader();
        ReportBody body = creator.createBody();
        header.print();
        body.print();
    }
}
