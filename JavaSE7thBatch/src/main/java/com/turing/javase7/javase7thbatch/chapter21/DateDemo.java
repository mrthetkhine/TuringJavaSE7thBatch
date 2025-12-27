/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter21;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author macbook
 */
public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Date "+date);
        
        long time = date.getTime();
        System.out.println("Time "+time);
        
        Date another = new Date();
        System.out.println("Before "+date.before(another));
        System.out.println("After "+date.after(another));
        
        System.out.println("Month "+date.getMonth());
        
        Calendar calendar = Calendar.getInstance();
        
        //calendar.add(Calendar.DATE, 10);
        calendar.add(Calendar.MONTH, 2);
        System.out.println("Date "+calendar.get(Calendar.DATE));
        System.out.println("Month "+calendar.get(Calendar.MONTH));
        System.out.println("Year "+calendar.get(Calendar.YEAR));
        System.out.println("Day "+calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("Day of the week "+calendar.get(Calendar.DAY_OF_WEEK));
    }
}
