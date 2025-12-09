/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter14;

/**
 *
 * @author macbook
 */
class TwoD
{
    int x,y;
    public TwoD(int x,int y)
    {
        this.x = x;
        this.y = y;
    }
    
}
class ThreeD extends TwoD
{
    int z;
    public ThreeD(int x,int y, int z)
    {
        super(x,y);
        this.z = z;
    }
}
class FourD extends ThreeD
{
    int t;
    public FourD(int x,int y,int z, int t)
    {
        super(x,y,z);
        this.t = t;
    }
}
class Coord<T extends TwoD>
{
    T[] coords;
    public Coord(T[] coords)
    {
        this.coords = coords;
    }
    static void showXY(Coord<?> c)//TwoD,ThreeD,FourD
    {
        System.out.println("X Y Coordiate");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println("X "+c.coords[i].x + " y "+c.coords[i].y);
        }
    }
    static void showXYZ(Coord<? extends ThreeD> c)//ThreeD,FourD
    {
        System.out.println("X Y Z Coordiate");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println("X "+c.coords[i].x + " y "+c.coords[i].y 
                    + " z "+c.coords[i].z);
        }
    }
}
public class BoundedWildcardDemo {
    public static void main(String[] args) {
        ThreeD []threeDPoints = {
            new ThreeD(1,2,3),
            new ThreeD(4,5,6),
        };

        TwoD []twoDPoints = {
            new TwoD(1,2),
            new TwoD(4,5),
        };        
        Coord<TwoD> twoDCoord =new Coord<>(twoDPoints);
        Coord<ThreeD> threeDCoord =new Coord<>(threeDPoints);
        
        Coord.showXYZ(threeDCoord);
        Coord.showXY(threeDCoord);
        
        //Coord.showXYZ(twoDCoord);
    }
}
