package com.Assignment1_Program1.Employee.EmployeeTest;

import com.Assignment1_Program1.Employee.*;

public class EmployeeDemo
{
    public static void main(String[] args)
    {
        // Instantiate each type of employee
        SalariedEmployee employee1 = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500.00);
        HourlyEmployee employee2 = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25.00, 32);
        HourlyEmployee employee3 = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19.00, 47);
        CommissionEmployee employee4 = new CommissionEmployee("Nicole", "Dior", "444-44-4444", 0.15, 50000.00);
        BaseEmployee employee5 = new BaseEmployee("Renwa", "Chanel", "555-55-5555", 1700.00); // Only base salary now
        SalariedEmployee employee6 = new SalariedEmployee("Mike", "Davenport", "666-66-6666", 95000.00);
        CommissionEmployee employee7 = new CommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", 0.22, 40000.00);

        // Display information for each employee
        System.out.println(employee1);
        System.out.println();
        System.out.println(employee2);
        System.out.println();
        System.out.println(employee3);
        System.out.println();
        System.out.println(employee4);
        System.out.println();
        System.out.println(employee5);
        System.out.println();
        System.out.println(employee6);
        System.out.println();
        System.out.println(employee7);
    }
}
