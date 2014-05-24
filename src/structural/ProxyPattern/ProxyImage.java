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
public class ProxyImage implements Image{
    private RealImage realImage;
    String fileNmae;
public ProxyImage(String fileName){
    this.fileNmae=fileName;
}
    @Override
    public void display() {
        if(realImage==null){
            realImage=new RealImage(fileNmae);
        }
        realImage.display();
  }
    
}
