/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.designpattern.abstractfactory;

/**
 *
 * @author macbook
 */
public class XMLReportFactory implements ReportFactory{

    @Override
    public ReportHeader createHeader() {
        return new XMLReportHeader();
    }

    @Override
    public ReportBody createBody() {
        return new XMLReportBody();
    }
    
}
