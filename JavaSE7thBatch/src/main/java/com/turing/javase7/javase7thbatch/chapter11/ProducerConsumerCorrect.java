/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter11;

/**
 *
 * @author macbook
 */
public class ProducerConsumerCorrect {
    public static void main(String[] args) {
        IQueue queue = new CorrectQueue();
        
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);
        //Consumer consumer2 = new Consumer(queue);
        
        producer.start();
        consumer.start();
        //consumer2.start();
        
    }
}
