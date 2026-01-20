package com.automationhub.java.finalKeyword;

class Employee {

    final int empId;

    Employee(int id) {
        empId = id;   // initialized once
    }

    void display() {
        System.out.println("Employee ID: " + empId);
    }

    public static void main(String[] args) {
        Employee e = new Employee(101);
        e.display();
    }
}
