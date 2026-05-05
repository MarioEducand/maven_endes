package com.miempresa.app;

/**
 * @author Mario Cano
 * @version 1.0
 */
public class Employee {
    private String name;
    private int years;

    public Employee(String name, int years) {
        this.name = name;
        this.years = years;
    }

    public String getName() { return name; }
    public int getYears() { return years; }
}