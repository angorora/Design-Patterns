/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package creational.Factory;

import creational.AbstractFactory.AbstractFactory;
import creational.AbstractFactory.Colour;

/**
 *
 * @author marc
 */
public class ShapeFactory implements AbstractFactory{
    @Override
    public Shape getShape(String shapeType){
        if(shapeType == null)
            return null;
        else if(shapeType.equals("rectangle")){
            return new Rectangle();
        }
        else if(shapeType.equals("circle")){
            return new Circle();
        }
        else if(shapeType.equals("triangle")){
            return new Triangle();
        }
        return null;
    }

    @Override
    public Colour getColour(String colour) {
       return null;
}   }
