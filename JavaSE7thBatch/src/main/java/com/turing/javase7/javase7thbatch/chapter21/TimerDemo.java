/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter21;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author macbook
 */
class MyTask extends TimerTask
{

    @Override
    public void run() {
        System.out.println("MyTask executed "+new Date().toString());
    }
}
public class TimerDemo {
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Timer timer = new Timer();
        
        System.out.println("Timer created");
        timer.schedule(task, 1000,1000);
        
        System.out.println("Done");
    }
}
