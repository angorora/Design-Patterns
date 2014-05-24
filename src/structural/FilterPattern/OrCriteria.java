/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package structural.FilterPattern;

import java.util.List;

/**
 *
 * @author marc
 */
public class OrCriteria implements Criteria{
   private Criteria otherCriteria;
   private Criteria criteria;
    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
      List<Person> firstCriteriaItems = criteria.meetCriteria(persons);
      List<Person> otherCriteriaItems = otherCriteria.meetCriteria(persons);
      for(Person person: otherCriteriaItems ){
          if(!otherCriteriaItems.contains(person)){
              firstCriteriaItems.add(person);
          }
      }
      return firstCriteriaItems;
    }
    
}
