/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.designpattern.adapter.objectadapter;

import com.turing.javase7.javase7thbatch.designpattern.adapter.Api;
import com.turing.javase7.javase7thbatch.designpattern.adapter.OldApi;

/**
 *
 * @author macbook
 */
public class NewApi implements Api{

    OldApi oldApi = new OldApi();
    
    @Override
    public void api() {
        this.oldApi.oldApi();
    }
    
    
}
