/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter29;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

/**
 *
 * @author macbook
 */
class FileDownloader extends Thread
{
    CountDownLatch latch;
    FileDownloader(CountDownLatch latch)
    {
        this.latch = latch;
    }
    public void run()
    {
        
        Random random = new Random();
        int count = random.nextInt(10);
        
        System.out.println("Count "+count);
        for (int i = 0; i < count; i++) {
            try
            {
                Thread.sleep(100);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        System.out.println("Download file done");
        this.latch.countDown();
    }
}
public class IDMDemo {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(3);
        
        FileDownloader t1 = new FileDownloader(latch);
        FileDownloader t2 = new FileDownloader(latch);
        FileDownloader t3 = new FileDownloader(latch);
        FileDownloader t4 = new FileDownloader(latch);
        FileDownloader t5 = new FileDownloader(latch);
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        
        try
        {
            latch.await();
            System.out.println("Start consuming file");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
}
