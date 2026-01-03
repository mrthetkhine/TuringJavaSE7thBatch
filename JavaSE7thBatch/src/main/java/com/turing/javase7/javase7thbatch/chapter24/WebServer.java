/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter24;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author macbook
 */
class WebClientHandler extends Thread
{
    Socket socket;
    WebClientHandler(Socket socket)
    {
        this.socket = socket;
    }
    public void run()
    {
        try(DataInputStream din = new DataInputStream(this.socket.getInputStream());
            DataOutputStream dout = new DataOutputStream(this.socket.getOutputStream()))
        {
            System.out.println("Client connected");
            String statusLine =  din.readLine();
            System.out.println("status line "+statusLine);
            
            String body = """
                          <html>
                            <h1>Hello from web server</h1>
                          </html>
                          """;
            String httpResponse = "HTTP/1.0 200 OK\r\n"
                                +"Content-Type: text/html\r\n"
                                +"Content-Lenght: "+body.length()+"\r\n"
                                +"Connection: Closed\r\n\r\n"
                                +body;
            dout.write(httpResponse.getBytes());
            dout.flush();
            
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
public class WebServer {
    public static void main(String[] args) {
        try 
        {   
            int port = 9000;
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Server listened at "+port);
            while(true)
            {
                Socket socket = serverSocket.accept();
                System.out.println("We got connection");
                WebClientHandler handler = new WebClientHandler(socket);
                handler.start();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
