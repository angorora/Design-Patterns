/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package creational.AbstractFactory;

import creational.Factory.Shape;

/**
 *
 * @author marc
 */
public class ColourFactory implements AbstractFactory{
    public Colour getColor(String colour){
        if(colour.equalsIgnoreCase(null))
            return null;
        if(colour.equalsIgnoreCase("red")){
            return new Red();
        }
        else if(colour.equalsIgnoreCase("green")){
            return new Green();
        }
       return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;    
    }

    @Override
    public Colour getColour(String colour) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
