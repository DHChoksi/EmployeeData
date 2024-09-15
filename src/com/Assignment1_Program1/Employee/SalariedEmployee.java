package com.Assignment1_Program1.Employee;

public class SalariedEmployee extends Employee
{
    private double m_WeeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary)
    {
        super(firstName, lastName, socialSecurityNumber);
        m_WeeklySalary = weeklySalary;
    }

    public double getWeeklySalary()
    {
        return m_WeeklySalary;
    }

    public void setWeeklySalary(double weeklySalary)
    {
        m_WeeklySalary = weeklySalary;
    }

    @Override
    public String toString()
    {
        return super.toString() + String.format("\nWeekly Salary: $%.2f", m_WeeklySalary);
    }
}
