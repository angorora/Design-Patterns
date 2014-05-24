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
public interface AbstractFactory {
    public Shape getShape(String shape);
    public Colour getColour(String colour);
}
