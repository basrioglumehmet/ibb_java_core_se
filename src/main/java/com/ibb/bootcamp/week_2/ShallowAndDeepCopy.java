package com.ibb.bootcamp.week_2;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@ToString
class Employee implements Cloneable {
    private String fullName;
    private List<EmployeeResponsibility> employeeResponsibilities;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Employee cloned = (Employee) super.clone();
        // Shallow Copy: Referanslar aynıdır, bu yüzden değiştirdiğimizde orijinali de etkiler.
        return cloned;
    }

    public Employee deepClone() throws CloneNotSupportedException {
        Employee cloned = (Employee) super.clone();
        List<EmployeeResponsibility> clonedResponsibilities = new ArrayList<>();

        for (EmployeeResponsibility responsibility : this.employeeResponsibilities) {
            clonedResponsibilities.add((EmployeeResponsibility) responsibility.clone());
        }
        cloned.setEmployeeResponsibilities(clonedResponsibilities);
        return cloned;
    }
}

@AllArgsConstructor
@Data
@ToString
class EmployeeResponsibility implements Cloneable {
    private String inChargeOf;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class ShallowAndDeepCopy {
    public static void compareObjects(Object object, Object object2) {
        if (object == object2) {
            System.out.println("Shallow Copy");
        } else {
            System.out.println("Deep Copy");
        }
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setFullName("Mehmet Basrioğlu");
        employee.setEmployeeResponsibilities(List.of(
                new EmployeeResponsibility("Backend Development"),
                new EmployeeResponsibility("Java Development")
        ));

        // Shallow Copy
        Employee shallowClone = null;
        try {
            shallowClone = (Employee) employee.clone();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }

        System.out.print("Shallow Copy Test: ");
        compareObjects(employee.getEmployeeResponsibilities(), shallowClone.getEmployeeResponsibilities());

        // Orijinal nesneyi etkileyen değişiklik yapalım
        shallowClone.getEmployeeResponsibilities().get(0).setInChargeOf("Java Development");
        System.out.println("Orijinal Nesne (Shallow Copy Sonrası Değişim): " + employee);

        // Deep Copy
        Employee deepClone = null;
        try {
            deepClone = employee.deepClone();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }

        System.out.print("Deep Copy Test: ");
        compareObjects(employee.getEmployeeResponsibilities(), deepClone.getEmployeeResponsibilities());

        // Derin kopyada değişiklik yapalım
        deepClone.getEmployeeResponsibilities().get(0).setInChargeOf("Full Stack Development");
        System.out.println("Orijinal Nesne (Deep Copy Sonrası Değişim): " + employee);
        System.out.println("Deep Copy Nesnesi: " + deepClone);
    }
}
