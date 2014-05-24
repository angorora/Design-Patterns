/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package structural.Facade;

import creational.Factory.Shape;

/**
 *
 * @author marc
 */
public class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("We are the ones who draw all squares"); 
    }
    
}
