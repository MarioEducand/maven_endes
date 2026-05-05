package com.miempresa.app;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mario Cano
 * @version 1.0
 */
public class EmployeeManager {
    // Cambio de arrays por lista dinámica
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(String name, int years) {
        employees.add(new Employee(name, years)); // Sin límite de 10
        System.out.println(name + " añadido.");
    }

    public void printEmployees() {
        // Uso de bucle for-each para mayor claridad
        for (Employee e : employees) {
            System.out.println(e.getName() + ", Años: " + e.getYears());
        }
    }

    public static void main(String[] args) {
        EmployeeManager em = new EmployeeManager();
        em.addEmployee("John Doe", 5);
        em.printEmployees();
    }
}