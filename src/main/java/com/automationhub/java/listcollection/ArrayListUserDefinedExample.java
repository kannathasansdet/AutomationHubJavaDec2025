package com.automationhub.java.listcollection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListUserDefinedExample {

    public static void main(String[] args) {

        // Creating ArrayList to store Employee objects
        ArrayList<Employee> employeeList = new ArrayList<>();

        // Adding Employee objects
        employeeList.add(new Employee(101, "Alice", 50000));
        employeeList.add(new Employee(102, "Bob", 60000));
        employeeList.add(new Employee(103, "Charlie", 55000));

        // Displaying employees
        for (Employee emp : employeeList) {
            emp.display();
        }

        Iterator<Employee> iterator = employeeList.iterator();
        while (iterator.hasNext()) {
            iterator.next().display();
        }

        Iterator<Employee> iterator1 = employeeList.iterator();

        while (iterator1.hasNext()) {
            Employee emp = iterator1.next();

            if (emp.salary < 55000) {
                iterator1.remove();
            }
        }

    }
}
