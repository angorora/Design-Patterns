/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package structural.FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marc
 */
public class SingleCriteria implements Criteria{

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
         List<Person> singlePerson  = new ArrayList<>();
     for(Person pers:persons){
         if(pers.getMaritalStatus().equalsIgnoreCase("Single")){
             singlePerson .add(pers);
         }
      }
      return singlePerson ;
    }
    
}
