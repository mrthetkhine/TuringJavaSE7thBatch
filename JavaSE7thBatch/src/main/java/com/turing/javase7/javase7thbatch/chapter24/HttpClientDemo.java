/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter24;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
public class HttpClientDemo {
    public static void main(String[] args) {
        HttpClient hc = HttpClient.newHttpClient();
        
        try {
            HttpRequest req = HttpRequest
                    .newBuilder(new URI("https://jsonplaceholder.typicode.com/todos/1"))
                    .build();
            HttpResponse<String> resp = hc.send(req, HttpResponse.BodyHandlers.ofString());
            
            System.out.println("Status code "+resp.statusCode());   
            Map<String,List<String>> headers = resp.headers().map();
            Set<String> keys = headers.keySet();
            
            for(String key : keys)
            {
                System.out.println(key+" : "+headers.get(key) );
            }
            System.out.println("Response "+resp.body());
            
        } catch (URISyntaxException ex) {
            Logger.getLogger(HttpClientDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(HttpClientDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(HttpClientDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
