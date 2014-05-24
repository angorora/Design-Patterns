/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package creational.AbstractFactory;

import creational.Factory.ShapeFactory;

/**
 *
 * @author marc
 */
public class FactoryProducer {
    public static  AbstractFactory getFactory(String factory){
        if(factory ==null)
            return null;
        if(factory.equalsIgnoreCase("colour"))
            return new ColourFactory();
        else if(factory.equalsIgnoreCase("shape"))
            return new ShapeFactory();
        return null;
    }
}
