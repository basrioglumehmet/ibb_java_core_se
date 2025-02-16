package com.ibb.bootcamp.week_2.java_8_features;

import java.util.function.Supplier;

class Employee {
    private String fullName;

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return this.fullName;
    }
}

public class SupplierDemo {
    // Constructor içinde işlemi yapıyoruz
    private Employee employee;

    public SupplierDemo() {
        Supplier<Employee> employeeSupplier = Employee::new; // Lambda yerine method reference
        employee = employeeSupplier.get();
        employee.setFullName("Mehmet Basrioğlu");
    }

    public void printEmployee() {
        System.out.println("Çalışan: " + employee.getFullName());
    }

    public static void main(String[] args) {
        SupplierDemo demo = new SupplierDemo();
        demo.printEmployee(); // Çalışan: John Doe
    }
}
