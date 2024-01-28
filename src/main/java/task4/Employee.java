package task4;

import java.math.BigDecimal;

public class Employee {

    public Employee(String n, String sN) {
        this.name = n;
        this.surname = sN;
    }

    public Employee(String n, String sN, int age) {
        this.name = n;
        this.age = age;
        this.surname = sN;
    }

    public Employee(String n, String sN, int age, BigDecimal value) {
        this.name = n;
        this.age = age;
        this.surname = sN;
        this.baseSalary = value;
    }

    public Employee(String name, int age, BigDecimal value1, BigDecimal value2, String surname) {
        this.name = name;
        this.age = age;
        this.baseSalary = value1;
        this.bonus = value2;
        this.surname = surname;
    }

    private final String name;
    private final String surname;
    private int age;

    public String getemployee_Info() {
        return "Employee name : " + name + " " + surname;
    }

    public String getEmployeeDetails() {
        return "Employee details : " + name + WHITE_SPACE + surname + " is " + age;
    }

    public static final String WHITE_SPACE = " ";

    // Method is used to get total  salary
    public BigDecimal getSalary_1() {
        return baseSalary.add(bonus);
    }

    public BigDecimal getSalary_2() {
        return baseSalary;
    }

    public BigDecimal get_B() {
        return bonus;
    }

    private BigDecimal baseSalary;
    private BigDecimal bonus;

}