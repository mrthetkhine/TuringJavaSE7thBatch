/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter29;

import java.util.Random;
import java.util.concurrent.Phaser;

/**
 *
 * @author macbook
 */
class PhaseRunner extends Thread
{
    String name;
    Phaser phaser;
    
    PhaseRunner(Phaser phaser, String name)
    {
        this.phaser = phaser;
        this.name = name;
        
        this.phaser.register();
    }
    public void run()
    {
        System.out.println(this.name +" begin phase 1");
        this.phaser.arriveAndAwaitAdvance();
        
        Random random = new Random();
        try
        {
             
            int count = random.nextInt(1000);
        
            //System.out.println("Count "+count);
            Thread.sleep(count);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        System.out.println(this.name+ " begin phase 2");
        this.phaser.arriveAndAwaitAdvance();
        
        try
        {
             
            int count = random.nextInt(1000);
        
            //System.out.println("Count "+count);
            Thread.sleep(count);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
         System.out.println(this.name+ " begin phase 3");
        this.phaser.arriveAndAwaitAdvance();
    }
}
public class PhaserDemo {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(1);
        
        int curPhase;
        PhaseRunner t1 = new PhaseRunner(phaser,"One");
        PhaseRunner t2 = new PhaseRunner(phaser,"Two");
        PhaseRunner t3 = new PhaseRunner(phaser,"Three");
        
        t1.start();
        t2.start();
        t3.start();
        
        curPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        
        System.out.println("Phase "+curPhase+" complete ");
        
        curPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        
        System.out.println("Phase "+curPhase+" complete ");
        
        curPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        
        System.out.println("Phase "+curPhase+" complete ");
        phaser.arriveAndDeregister();
        
        if(phaser.isTerminated())
        {
            System.out.println("Terminated");
        }
    }
}
