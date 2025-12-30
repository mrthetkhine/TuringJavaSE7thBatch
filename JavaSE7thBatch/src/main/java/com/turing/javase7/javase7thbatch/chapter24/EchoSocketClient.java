/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter24;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
public class EchoSocketClient {
    public static void main(String[] args) {
        try {
            InetAddress google= InetAddress.getLocalHost();
            
            Socket socket =new Socket(google,9000);
           
            try(OutputStream out = socket.getOutputStream();
                    DataInputStream in =new DataInputStream(socket.getInputStream());
                    )
            {
                String httpRequest = "Hello\r\n";
                                    
                out.write(httpRequest.getBytes());
                out.flush();
                
                System.out.println("Request send");
                String str = in.readLine();
             
                System.out.println(str);
            }
            socket.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
