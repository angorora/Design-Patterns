/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package structural.FilterPattern;

import structural.FilterPattern.Person;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marc
 */
public class CriteriaMale implements Criteria{

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
     List<Person> maleperson = new ArrayList<>();
     for(Person pers:persons){
         if(pers.getGender().equalsIgnoreCase("MALE")){
             maleperson.add(pers);
         }
      }
      return maleperson;
}
}