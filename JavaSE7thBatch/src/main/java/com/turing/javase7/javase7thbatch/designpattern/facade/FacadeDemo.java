/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.designpattern.facade;

/**
 *
 * @author macbook
 */
class Harddisk
{
    public void loadBootSector()
    {
        System.out.println("Load Boot Sector");
    }
}
class CPU
{
    void run()
    {
        System.out.println("CPU run");
    }
}
class ComputerFacade
{
    Harddisk hd = new Harddisk();
    CPU cpu = new CPU();
        
    void start()
    {
        this.hd.loadBootSector();
        this.cpu.run();
    }
}
public class FacadeDemo {
    public static void main(String[] args) {
        /*
        Harddisk hd = new Harddisk();
        CPU cpu = new CPU();
        
        hd.loadBootSector();
        cpu.run();
        */
        ComputerFacade facade = new ComputerFacade();
        facade.start();
    }
}
