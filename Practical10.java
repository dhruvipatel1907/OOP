/**Create an Employee class with private instance variables for employeeName (String) and 
employeeSalary (double). Implement public methods readEmployeeData() (to take input 
from the user) and displayEmployeeData() (to print the employee's name and salary). 
Demonstrate object creation and method invocation in a main method.*/

import java.util.Scanner;

class Employee
{
    private String employeeName;
    private double employeeSalary;

    void readEmployeeData()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        employeeName = sc.nextLine();

        System.out.print("Enter employee salary: ");
        employeeSalary = sc.nextDouble();
    }

    void displayEmployeeData()
    {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Salary: " + employeeSalary);
    }

    public static void main(String[] args)
    {
        Employee e1 = new Employee();

        e1.readEmployeeData();
        e1.displayEmployeeData();
    }
}
