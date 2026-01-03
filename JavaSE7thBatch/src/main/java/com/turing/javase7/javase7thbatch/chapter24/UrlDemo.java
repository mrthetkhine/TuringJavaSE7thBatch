/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter24;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
public class UrlDemo {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.goolge.com");
            
            System.out.println("Portocol "+url.getProtocol());
            System.out.println("Port "+url.getPort());
            System.out.println("File "+url.getFile());
            System.out.println("Host "+url.getHost());
            System.out.println("External form "+url.toExternalForm());
            
            URLConnection con = url.openConnection();
            
            try(InputStream in = con.getInputStream())
            {
                int ch;
                while( (ch= in.read()) !=-1)
                {
                    System.out.print((char)ch);
                }
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
            
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(UrlDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(UrlDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
