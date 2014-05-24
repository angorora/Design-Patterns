/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package structural.ProxyPattern;

/**
 *
 * @author marc
 */
public class RealImage implements Image{
    String fileName;
    
public RealImage(String fileName){
    this.fileName=fileName;
    loadFromDisk(fileName);
}
 private void loadFromDisk(String fileName) {
     System.out.println("Loading from disk...");    }
    @Override
    public void display() {
        System.out.println("Displaying Image from file");
    }

   
    
}
