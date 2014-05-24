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
public abstract class AbstractHandler {
    AbstractHandler successor;
    public void setSuccessor(AbstractHandler success){
        this.successor=success;
    } 
    public abstract void handleRequest(PlanetEnum penum);
}
