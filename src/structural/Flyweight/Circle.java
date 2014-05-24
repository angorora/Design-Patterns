/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package structural.Flyweight;

import creational.Factory.Shape;

/**
 *
 * @author marc
 */
public class Circle implements Shape{
    public String colour;
    public int radius;
    public int x;
    public int y;

    

    Circle(String colour) {
        this.colour=colour;   
     }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void draw() {
          System.out.println("Circle: Draw() [Color : " + colour 
         +", x : " + x +", y :" + y +", radius :" + radius);    }
    
}
