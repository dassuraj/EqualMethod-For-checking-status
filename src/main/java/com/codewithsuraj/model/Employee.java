package com.codewithsuraj.model;

import java.util.Objects;

/**
 * creating employee class
 */
public class Employee {
    private int id;
    private String name;
    private String salary;

    /**
     * creating parametrised constructor
     * @param id
     * @param name
     * @param salary
     */

    public Employee(int id, String name, String salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    /**
     * creating setter and getter for assigning and
     * returning values
     * @return
     */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    /**
     * learning without generating equals and hashCode method
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        /**
         * if same object is passed then
         */
        if (obj==this){
            return true;
        }
        /**
         * checking for the null value
         * if we are getting object null then we have to return false
         */
        if (obj==null){
            return false;
        }
        /**
         * if we are comparing two different type class then
         * if the class is not same then return false
         */
        if (obj.getClass() !=this.getClass()){
            return false;
        }
       Employee employee=(Employee) obj;
        /**
         * checking the id that both the object employee has
         * same id or not if not then it will return false else true
         *
         **/
        if (this.id!=employee.id){
            return false;
        }
        /**
         * similarly checking name and salary that it is equal or not
         */
        /**
         * if  the name  pass is null then it gives nullPointerException
         * solving
         */
        if (this.name ==null){
            if (employee.name!=null){
                return false;
            }
        }
        if(!this.name.equals(employee.name)){
            return false;
        }
        if (this.salary!=employee.salary){
            return false;
        }
        return true;
    }

/**
 * generating using id
 * equal and hashcode method
 */

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Employee employee = (Employee) o;
//        return id == employee.id && Objects.equals(name, employee.name) && Objects.equals(salary, employee.salary);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name, salary);
//    }
}
