/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter11;

/**
 *
 * @author macbook
 */

class Producer extends Thread
{
    IQueue queue;
    
    public Producer(IQueue queue)
    {
        this.queue = queue;
    }
    public void run()
    {
        int i=0;
        while(true)
        {
            this.queue.put(i++);
        }
    }
}
class Consumer extends Thread
{
    IQueue queue;
    
    public Consumer(IQueue queue)
    {
        this.queue = queue;
    }
    public void run()
    {
      
        while(true)
        {
            this.queue.get();
        }
    }
}
public class IncorrectProducerConsumer {
    public static void main(String[] args) {
        IQueue queue = new IncorrectQueue();
        
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);
        
        producer.start();
        consumer.start();
    }
}
