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
public class EarthHandler extends AbstractHandler{

    @Override
    public void handleRequest(PlanetEnum penumMember) {
        if(penumMember==PlanetEnum.Earth){
            System.out.println("Its Mother Earth Yay!!");
        }
        else{
             System.out.println("I couldnt handle " +penumMember);
            if(successor!=null){
                successor.handleRequest(penumMember);
            }
        }
   }
    
}
