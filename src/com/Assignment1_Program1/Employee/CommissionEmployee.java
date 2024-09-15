package com.Assignment1_Program1.Employee;

public class CommissionEmployee extends Employee
{
    private double m_CommissionRate;
    private double m_GrossSales;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double commissionRate, double grossSales)
    {
        super(firstName, lastName, socialSecurityNumber);
        m_CommissionRate = commissionRate;
        m_GrossSales = grossSales;
    }

    public double getCommissionRate() {
        return m_CommissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        m_CommissionRate = commissionRate;
    }

    public double getGrossSales() {
        return m_GrossSales;
    }

    public void setGrossSales(double grossSales) {
        m_GrossSales = grossSales;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\nCommission Rate: %.2f%%\nGross Sales: $%.2f", m_CommissionRate * 100, m_GrossSales);
    }
}