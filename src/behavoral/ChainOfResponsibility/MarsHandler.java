/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavoral.ChainOfResponsibility;

/**
 *
 * @author marc
 */
public class MarsHandler extends AbstractHandler {

    @Override
    public void handleRequest(PlanetEnum penumMember) {
        if (penumMember == PlanetEnum.Mars) {
            System.out.println("Its the Red Planet here!!");
        } else {
            System.out.println("I couldnt handle " +penumMember);
            if (successor != null) {
                successor.handleRequest(penumMember);
            }
        }
    }

}
