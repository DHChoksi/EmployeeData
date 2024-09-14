package com.Assignment.Employee;

public class Employee
{
    //Variables
    private String m_FirstName;
    private String m_LastName;
    private String  m_SocialSecurityNumber;

    // Constructor
    public Employee(String firstName, String lastName, String socialSecurityNumber)
    {
        m_FirstName = firstName;
        m_LastName = lastName;
        m_SocialSecurityNumber = socialSecurityNumber;
    }

    // Getter - Setter method
    public String getFirstName()
    {
        return m_FirstName;
    }

    public  void setFirstName(String firstName)
    {
        m_FirstName = firstName;
    }

    public String getLastName()
    {
        return m_LastName;
    }

    public void setLastName(String lastName)
    {
        m_LastName = lastName;
    }

    public String getSocialSecurityNumber()
    {
        return m_SocialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber)
    {
        m_SocialSecurityNumber = socialSecurityNumber;
    }

    // toString method
    @Override
    public String toString()
    {
        return String.format("First Name: %s\nLast Name:%s\nSSN: %s", m_FirstName, m_LastName, m_SocialSecurityNumber);
    }
}
