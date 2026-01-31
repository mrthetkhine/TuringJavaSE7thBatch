/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.designpattern.adapter.classadapter;

import com.turing.javase7.javase7thbatch.designpattern.adapter.OldApi;
import com.turing.javase7.javase7thbatch.designpattern.adapter.Api;

/**
 *
 * @author macbook
 */
public class NewApi extends OldApi implements Api{

    @Override
    public void api() {
        super.oldApi();
    }
    
}
