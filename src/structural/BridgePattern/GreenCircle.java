/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package structural.BridgePattern;

/**
 *
 * @author marc
 */
public class GreenCircle implements DrawAPI{

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Iam drawing a green circle of radius: "+ radius+" x: "+ x+" y: "+ y);   
    }
    
}
