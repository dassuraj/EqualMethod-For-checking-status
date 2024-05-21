package com.codewithsuraj.test;

import com.codewithsuraj.model.Employee;
import com.codewithsuraj.model.People;

public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "emp1", "10");
        Employee employee1 = employee;
        /**
         * if two reference are pointing to the same object,
         * object class equals() will return true otherwise
         * false
         */
        /**
         * in the below comment example equals methods check for the reference
         * that both object is pointing to the same heap area or not
         * if it is pointing to the same heap of memory then it will return
         * true else it will return false
         */
//        boolean status=employee1.equals(employee2);
        System.out.println(employee == employee1);


        /**
         * let's create two object with different data
         */
        Employee employee2 = new Employee(2, "emp2", "100");
        Employee employee3 = new Employee(3, "emp", "1000");

        System.out.println(employee2.equals(employee3));


        /**
         * now let's check it for string class
         */
        String str = new String("manish");
        String str1 = new String("shivam");
        String str2 = new String("shivam");
        boolean status = str.equals(str1);
        System.out.println(status);

        status = str1.equals(str2);
        /**
         *  there is two objects of string type still getting true when comparing
         *  hence in this example the values/contents of two objects are comparing
         *  so shivam and shivam is  equal so returns true .So  String equals method
         *  is used for content comparing as equals methods of string uses string class
         *  which is used for comparing content and returns true if both have same content
         *  and returns false If does bot have same content and have null value passed in argument
         *  of equal method
         */

        /**
         * why we need content comparing
         * Now creating two objects and with same value both
         * pointing different heap of memory
         */
        Employee employee4 = new Employee(1, "shyam", "500k");
        Employee employee5 = new Employee(1, "shyam", "500k");
        status = employee4.equals(employee5);
        System.out.println(status);
        /**
         * since we have same content but both have different objects and  heap location of object.
         * desire answer is true But it returns false since when
         * we  use equals method of object class for object comparing it checks for reference comparing
         * not for content comparing
         */

        /**
         * now if the contents are equals then it is  duplicates values So we
         * have provides our own logic And we have to override the   equals method in employee class
         * for understanding
         *
         */

        /**
         * after updating the equals method
         * for id checking if this.id != employee(obj).id
         * then it will return false
         *  Employee employee4=new Employee(1,"shyam","500k");
         *         Employee employee5=new Employee(1,"shyam","500k");
         *         status =employee4.equals(employee5);
         *         System.out.println(status);
         *         this code will return true as id matches so run anc check status of line
         *          58 to 61
         */
        /**
         * since we have to verify each term so that we can conclude that this is true else
         *  false so let's do for each term
         */

        /**
         * now checking each by step by step
         * first for id if it is equal but other is not equal what will be the status
         */
        Employee employee6 = new Employee(7, "suraj", "600k");
        Employee employee7 = new Employee(7, "ramesh", "700k");
        status = employee6.equals(employee7);
        System.out.println("id equal status::" + status);
        /**
         * since status, we get is id equal status::false as name and salary is not equal
         */

        //checking for the id and name equal conditions
        Employee employee8 = new Employee(8, "suraj", "600k");
        Employee employee9 = new Employee(8, "suraj", "700k");
        status =employee8.equals(employee9);
        System.out.println("id and name equal status::"+status);
        /**
         * get false answer as both id and name are equal but the
         * salary is not equal
         */

        // checking for all the three parameters
        Employee employee10 = new Employee(8, "suraj", "600k");
        Employee employee11 = new Employee(8, "suraj", "600k");
        status =employee10.equals(employee11);
        System.out.println("all three id name and salary ::" +status);
        /**
         * get true as all the values matches so gets true
         */

        //Now what will happen if we send null to the equals method parameter let's check
        status =employee10.equals(null);
        System.out.println("sending null value and getting result ::" +status);
        /**
         * Get result as NullPointerException since we are comparing null value with other value
         * so, we have to check condition for employee also
         */

        /**
         * after adding condition for null
         * let's create new object check its status
         */
        Employee employee12=new Employee(6,"samri","5k");
        status=employee12.equals(null);
        System.out.println("Null status checking :::"+status);
        /**
         * we get false as result
         * Null status checking :::false
         */

        /**
         * Now checking if same object is passed then it check all the condition step by step
         * so, it takes time
         * for that we will add another condition at the beginning for that condition
         * i employee and, we get  true without checking the all content
         */

        /**
         * what will happen if we pass the another type of object rather than employee
         * we get classCastException
         * lets create another class people and passed inside equals method
         */
        //creating object of people and allocating memory for people in heap
        People people=new People();
        /**
         * passing object people for checking status
         */
        status=employee10.equals(people);
        System.out.println("passing other type object and getting status before adding condition::"+ status);
        /**
         * get Exception in thread "main" java.lang.ClassCastException:
         */
        /**
         * Now adding the condition in employee class for solving problem
         * Exception in thread "main" java.lang.ClassCastException:
         */


        /**
         * after adding   if (obj.getClass() !=this.getClass()){
         *             return false;
         *         }
         *         we are not getting error and return false as result
         *
         */


        /**
         * checking the status for null value for this
         */
        Employee employee13=new Employee(10,null,"15k");
        Employee employee14=new Employee(10,"suraj","15k");
        status=employee13.equals(employee14);
        System.out.println("comparing null name and passing name::"+status);


    }

}
