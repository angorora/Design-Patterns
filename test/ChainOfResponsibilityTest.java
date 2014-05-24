/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import behavoral.ChainOfResponsibility.AbstractHandler;
import behavoral.ChainOfResponsibility.EarthHandler;
import behavoral.ChainOfResponsibility.MarsHandler;
import behavoral.ChainOfResponsibility.PhobosHandler;
import behavoral.ChainOfResponsibility.PlanetEnum;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author marc
 */
public class ChainOfResponsibilityTest {
    
    public ChainOfResponsibilityTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void hello() {
         AbstractHandler chainLeader = setUpChain();
         chainLeader.handleRequest(PlanetEnum.Phobos);
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
    public static AbstractHandler setUpChain(){
        AbstractHandler earthHandler = new EarthHandler();
        AbstractHandler marsHandler = new MarsHandler();
        AbstractHandler phobosHandler = new PhobosHandler();
        
        earthHandler.setSuccessor(marsHandler);
        marsHandler.setSuccessor(phobosHandler);
        return earthHandler;
    }
}
