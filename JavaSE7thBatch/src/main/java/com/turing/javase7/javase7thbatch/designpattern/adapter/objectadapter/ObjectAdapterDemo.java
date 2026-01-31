/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.designpattern.adapter.objectadapter;

import com.turing.javase7.javase7thbatch.designpattern.adapter.Api;

/**
 *
 * @author macbook
 */
public class ObjectAdapterDemo {
    public static void main(String[] args) {
        Api api = new NewApi();
        api.api();
    }
}
