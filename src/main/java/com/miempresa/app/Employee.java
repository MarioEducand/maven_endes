package com.miempresa.app;

/**
 * [APARTADO 1 y 6]
 * Clase que encapsula la información de un empleado.
 * 
 * @author Mario Cano
 * @version 1.0
 */
public class Employee {
    // [APARTADO 4] Propiedades privadas para mantener la encapsulación
    private String name;
    private int years;

    /**
     * [APARTADO 6]
     * Constructor para inicializar el objeto Employee.
     * @param name Nombre del trabajador.
     * @param years Antigüedad en la empresa.
     */
    public Employee(String name, int years) {
        this.name = name;
        this.years = years;
    }

    // [APARTADO 4] Métodos públicos para acceder a los datos de forma controlada
    public String getName() {
        return name;
    }

    public int getYears() {
        return years;
    }
}