/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.designpattern.builder;

/**
 *
 * @author macbook
 */
public class Text {
    String label;
    String color;
    String font;
    String decoration;
    
    public Text(Builder builder)
    {
        this.color = builder.color;
        this.label= builder.label;
        this.font = builder.font;
        this.decoration =builder.decoration;
            
    }

    @Override
    public String toString() {
        return "Text{" + "label=" + label + ", color=" + color + ", font=" + font + ", decoration=" + decoration + '}';
    }
    
    static class Builder{
        String label;
        String color;
        String font;
        String decoration;
        public Builder()
        {
        }
        Builder label(String lablel)
        {
            this.label = label;
            return this;
        }
        Builder color(String color)
        {
            this.color = color;
            return this;
        }
        Builder font(String font)
        {
            this.font = font;
            return this;
        }
        Builder decoration(String decoration)
        {
            this.decoration = decoration;
            return this;
        }
        public Text build()
        {
            return new Text(this);
        }
    }
}
