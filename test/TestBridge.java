/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import structural.BridgePattern.Circle;
import structural.BridgePattern.GreenCircle;
import structural.BridgePattern.RedClass;
import structural.BridgePattern.Shape;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author marc
 */
public class TestBridge {
    
    public TestBridge() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testBride() {
       Shape redCircle = new Circle(100,100,10,new RedClass());
       Shape greenCircle = new Circle(100,100,10,new GreenCircle());
       redCircle.draw();
       greenCircle.draw();
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
