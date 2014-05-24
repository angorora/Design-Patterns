/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import creational.AbstractFactory.AbstractFactory;
import creational.AbstractFactory.FactoryProducer;
import creational.Factory.Shape;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author marc
 */
public class TestAbstractFactory {
   private AbstractFactory absFact;
   Shape shape;
    public TestAbstractFactory() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testAbstractFactory() {
         absFact = FactoryProducer.getFactory("shape");
         shape=absFact.getShape("triangle");
         shape.draw();
     }

    @BeforeClass
    public static void setUpClass() throws Exception {
    
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
