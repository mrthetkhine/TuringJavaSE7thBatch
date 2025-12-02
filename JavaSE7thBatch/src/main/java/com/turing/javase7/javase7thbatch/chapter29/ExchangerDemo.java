/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter29;

import java.util.concurrent.Exchanger;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
class MakeString extends Thread
{
    Exchanger<String> exchanger;
    String str;
    
    public MakeString(Exchanger<String> exchanger)
    {
        this.exchanger = exchanger;
        this.str = new String();
    }
    public void run()
    {
        char ch = 'A';
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                str += ch ++;
            }
            try
            {
                str = this.exchanger.exchange(str);
                
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
class UseString extends Thread
{
    Exchanger<String> exchanger;
    String str;
    
    public UseString(Exchanger<String> exchanger)
    {
        this.exchanger = exchanger;
        this.str = new String();
    }
    public void run()
    {
        for (int i = 0; i < 3; i++) {
            try {
                str = this.exchanger.exchange(new String());
                System.out.println("Str got "+str);
            } catch (InterruptedException ex) {
                Logger.getLogger(UseString.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
public class ExchangerDemo {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<String>();
        MakeString maker = new MakeString(exchanger);
        UseString user = new UseString(exchanger);
        
        maker.start();
        user.start();
    }
}
