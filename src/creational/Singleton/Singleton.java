/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package creational.Singleton;

/**
 *
 * @author marc
 */
public class Singleton {
    private static  Singleton singleInstance = null;
    private Singleton(){
        
    }
    public static  Singleton getInstance(){
        if(singleInstance==null){
            return new Singleton();
        }
        return singleInstance;
    }
    public void sayHello(){
        System.out.println("A single object is being created everytime");
    }
}
