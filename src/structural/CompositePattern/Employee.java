/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package structural.CompositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marc
 */
public class Employee {
    private String name;
    private String dept;
    private double salary;
    private List<Employee> delegates;

    public Employee(String name, String dept, double salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        delegates = new ArrayList<>();
    }
    public void add(Employee e){
        delegates.add(e);
    }

    public List<Employee> getDelegates() {
        return delegates;
    }
    public void remove(Employee e){
        delegates.remove(e);
    }
     @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", dept=" + dept + ", salary=" + salary + ", delegates=" + delegates + '}';
    }
}
