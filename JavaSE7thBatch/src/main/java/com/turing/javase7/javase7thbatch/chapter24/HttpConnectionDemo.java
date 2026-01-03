/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter24;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
public class HttpConnectionDemo {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.goolge.com");
            
            System.out.println("Portocol "+url.getProtocol());
            System.out.println("Port "+url.getPort());
            System.out.println("File "+url.getFile());
            System.out.println("Host "+url.getHost());
            System.out.println("External form "+url.toExternalForm());
            
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            
            System.out.println("Request method "+con.getRequestMethod());
            System.out.println("Response code "+con.getResponseCode());
            System.out.println("Response Message "+con.getResponseMessage());
            
            Map<String,List<String>> headers = con.getHeaderFields();
            Set<String> keys = headers.keySet();
            
            for(String key : keys)
            {
                System.out.println(key+" : "+headers.get(key) );
            }
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(HttpConnectionDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(HttpConnectionDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
