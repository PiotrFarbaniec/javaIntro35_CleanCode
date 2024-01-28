package task4;

import java.math.BigDecimal;

public class Employee {

    private final String name;
    private final String surname;
    private int age;
    private BigDecimal baseSalary;
    private BigDecimal bonus;


    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Employee(String name, String surname, int age) {
        this.name = name;
        this.age = age;
        this.surname = surname;
    }

    public Employee(String name, String surname, int age, BigDecimal baseSalary) {
        this.name = name;
        this.age = age;
        this.surname = surname;
        this.baseSalary = baseSalary;
    }

    public Employee(String name, String surname, int age, BigDecimal baseSalary, BigDecimal bonus) {
        this.name = name;
        this.age = age;
        this.baseSalary = baseSalary;
        this.bonus = bonus;
        this.surname = surname;
    }    

    public String getEmployeeName() {
        return "Employee name : " + name + " " + surname;
    }

    public String getEmployeeNameWithAge() {
        return "Employee details : " + name + " " + surname + " is " + age;
    }


    // Method is used to get total  salary
    public BigDecimal getBaseSalaryWithBonus() {
        return baseSalary.add(bonus);
    }

    public BigDecimal getBaseSalary() {
        return baseSalary;
    }

    public BigDecimal getBonus() {
        return bonus;
    }
}