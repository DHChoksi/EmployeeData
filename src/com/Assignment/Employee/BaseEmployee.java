package com.Assignment.Employee;

public class BaseEmployee extends Employee{
    private double m_BaseSalary;

    // Constructor
    public BaseEmployee(String firstName, String lastName, String socialSecurityNumber, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber);
        m_BaseSalary = baseSalary;
    }

    // Getter and Setter for base salary
    public double getBaseSalary() {
        return m_BaseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        m_BaseSalary = baseSalary;
    }

    // toString method to display BaseEmployee info
    @Override
    public String toString() {
        return super.toString() + String.format("\nBase Salary: $%.2f", m_BaseSalary);
    }
}
