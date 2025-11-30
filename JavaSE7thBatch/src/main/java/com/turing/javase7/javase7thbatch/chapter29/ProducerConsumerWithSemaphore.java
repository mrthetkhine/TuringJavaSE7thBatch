/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter29;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
public class ProducerConsumerWithSemaphore {
    public static void main(String[] args) {
        QueueWithSemaphore sem = new QueueWithSemaphore();
            
            Producer producer = new Producer(sem);
            Consumer consumer = new Consumer(sem);
            
            producer.start();
            consumer.start();
        try {
            
            
            producer.join();
            consumer.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(ProducerConsumerWithSemaphore.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
