/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package structural.Facade;

import creational.Factory.Circle;
import creational.Factory.Rectangle;
import creational.Factory.Shape;

/**
 *
 * @author marc
 */
public class ShapeMaker {
   private Shape circle;
   private Shape rectangle;
   private Shape square;
   public ShapeMaker(){
       circle=new Circle();
       rectangle=new Rectangle();
       square= new Square();
   }
   public void drawCircle(){
       circle.draw();
   }
   public void drawRectangle(){
       rectangle.draw();
   }
   public void drawSquare(){
       square.draw();
   }
}