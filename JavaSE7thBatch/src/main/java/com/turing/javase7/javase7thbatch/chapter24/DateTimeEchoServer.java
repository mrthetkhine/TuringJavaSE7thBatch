/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter24;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
class ClientHandler extends Thread
{
    Socket clientSocket;
    ClientHandler(Socket socket)
    {
        this.clientSocket = socket;
    }
    public void run()
    {
        try(OutputStream out = this.clientSocket.getOutputStream();
            DataInputStream in =new DataInputStream(clientSocket.getInputStream()))
        {
            System.out.println("Waiting client request");
            String request = in.readLine();
            System.out.println("We got request "+request);
            String response = request.toUpperCase()+ new Date().toString()+"\r\n";
            
            out.write( response.getBytes());
            System.out.println("Response done");
            out.flush();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
public class DateTimeEchoServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(9000);
            System.out.println("Server listened at 9000");
            while(true)
            {
                Socket socket = serverSocket.accept();
                System.out.println("We got connection");
                ClientHandler handler = new ClientHandler(socket);
                handler.start();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
