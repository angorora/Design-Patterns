/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package creational.Prototype;

/**
 *
 * @author marc
 */
public class Person implements Prototype {
    String name;
public Person (String name){
    this.name=name;
}
    @Override
    public Prototype cloner() {
       return new Person(name);
    }
    public String getName(){
        return "Perso's name is " +name;
    }
}
