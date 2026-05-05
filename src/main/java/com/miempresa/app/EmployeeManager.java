package com.miempresa.app;

import java.util.ArrayList;
import java.util.List;

/**
 * [APARTADO 6]
 * Gestiona el conjunto de empleados de la empresa.
 * 
 * @author Mario Cano
 * @version 1.0
 */
public class EmployeeManager {
    
    // [APARTADO 2] Uso de Lista dinámica en lugar de arrays estáticos
    private List<Employee> employees = new ArrayList<>();

    /**
     * [APARTADO 3 y 6]
     * Añade un empleado sin restricciones de capacidad (antes limitado a 10).
     * @param name Nombre del empleado.
     * @param years Años en la empresa.
     */
    public void addEmployee(String name, int years) {
        // [APARTADO 3] Se elimina la comprobación de capacidad máxima
        employees.add(new Employee(name, years));
        System.out.println(name + " added to the system.");
    }

    /**
     * [APARTADO 5 y 6]
     * Imprime la lista de empleados de forma legible.
     */
    public void printEmployees() {
        System.out.println("List of employees:");
        // [APARTADO 5] Uso de bucle for-each para iterar la lista
        for (Employee emp : employees) {
            System.out.println(emp.getName() + ", Years in company: " + emp.getYears());
        }
    }

    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        manager.addEmployee("John Doe", 5);
        manager.addEmployee("Jane Smith", 2);
        manager.printEmployees();
    }
}