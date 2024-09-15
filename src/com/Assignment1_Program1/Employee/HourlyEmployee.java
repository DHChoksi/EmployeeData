package com.Assignment1_Program1.Employee;

public class HourlyEmployee extends Employee
{
    private double m_Wage;
    private double m_HoursWorked;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hoursWorked)
    {
        super(firstName, lastName, socialSecurityNumber);
        m_Wage = wage;
        m_HoursWorked = hoursWorked;
    }

    public double getWage()
    {
        return m_Wage;
    }

    public void setWage(double wage)
    {
        m_Wage = wage;
    }

    public double getHoursWorked()
    {
        return m_HoursWorked;
    }

    public void setHoursWorked(double hoursWorked)
    {
        m_HoursWorked = hoursWorked;
    }

    @Override
    public String toString()
    {
        return super.toString() + String.format("\nWage: $%.2f\nHours Worked: %.2f", m_Wage, m_HoursWorked);
    }
}
