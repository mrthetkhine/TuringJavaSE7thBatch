/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter12.nullcheck;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 *
 * @author macbook
 */
public class NullChecker {
    public static void checkNullString(Object obj)
    {
        Class clazz = obj.getClass();
        Field fields[] = clazz.getDeclaredFields();
        
        for(Field field : fields)
        {
            //System.out.println("Fieldname "+field.getName());
            Annotation[]annos =field.getDeclaredAnnotations();
            for(Annotation anno: annos)
            {
                //System.out.println("Anno "+anno);
                if(anno instanceof NotNull)
                {
                    try
                    {
                        Object value = field.get(obj);
                        if(value == null)
                        {
                            System.err.println(((NotNull) anno).message());
                        }
                        //System.out.println("Field "+field.getName() + " value "+value);
                                
                    }
                    catch(Exception e)
                    {
                        e.printStackTrace();
                    }
                    
                    
                }
            }
        }
    }
    
}
