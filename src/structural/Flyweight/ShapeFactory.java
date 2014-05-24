/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package structural.Flyweight;

import creational.Factory.Shape;
import java.util.HashMap;
import structural.Flyweight.Circle;
/**
 *
 * @author marc
 */
public class ShapeFactory {
    private static HashMap<String,Shape> hashcircle= new HashMap();
    public static Shape getCircle(String colour){
        Circle circle = (Circle)hashcircle.get(colour);
        if(circle==null){
            circle =new Circle(colour);
            hashcircle.put(colour, circle);
            System.out.println("Creating a Circle of colour:" + colour);
        }
        return circle;
    }
}
