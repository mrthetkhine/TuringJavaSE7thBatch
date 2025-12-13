/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter30;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 *
 * @author macbook
 */
public class MapFilterReduceDemo {
    public static void main(String[] args) {
        ArrayList<Human> list = new ArrayList<>();
        
        list.add(new Human("Aung Aung",31,Gender.Male));
        list.add(new Human("Win Win",12,Gender.Female));
        list.add(new Human("Naing Aung",20,Gender.Male));
        list.add(new Human("Mya Mya ",33,Gender.Female));
        list.add(new Human("Hla Hla Aung",35,Gender.Female));
        list.add(new Human("Aung Win",22,Gender.Male));
        
        Predicate<Human> isFemale= (h)->h.gender == Gender.Female;
        Predicate<Human> isMale= isFemale.negate();
        /*
        list
            .stream()
            .filter(isFemale)
            .map(h->h.name)
            .forEach(System.out::println);
        */    
        Optional<Human> result =  list
            .stream()
            .filter(isMale)
            .reduce((a,b)->{
                return a.age< b.age ? a : b;
            });
        System.out.println("Youngest "+ result.get());
        
        List<Human> females = list
            .stream()
            .filter(isFemale)
            .collect(Collectors.toList());
        System.out.println("Female");
        females.forEach(System.out::println);
                
    }
}
