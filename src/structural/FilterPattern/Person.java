/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package structural.FilterPattern;

/**
 *
 * @author marc
 */
public class Person {
    String name ;
    String gender;
    String maritalStatus;

    public Person(String name, String gender, String maritalStatus) {
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    
    
}
