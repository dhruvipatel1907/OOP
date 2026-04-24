/**Create a base class named Employee that contains a method displayDetails() which prints
general employee details such as name and department. Now create a subclass Manager
that inherits from Employee and overrides the displayDetails() method to include additional
information such as the manager's team size or project name. In the main method, create
objects of both Employee and Manager classes and call the displayDetails() method using
each object to show how Java determines which version of the method to execute at runtime.*/

import java.util.Scanner;

class Employee
{
    String name = "Dhruvi";
    String department = "CE";

    void displayDetails()
    {
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + department);
    }
}

class Manager extends Employee
{
    int teamSize = 5;
    String project = "E-Commerce App";

    void displayDetails()
    {
        System.out.println("Manager Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
        System.out.println("Project: " + project);
    }
}

class MainClass
{
    public static void main(String[] args)
    {
        System.out.println("Dhruvi Patel");
        System.out.println("240390107027");
        System.out.println();

        Scanner sc = new Scanner(System.in);

        Employee e = new Employee();

        System.out.println("Enter Employee details:");
        System.out.print("Name: ");
        e.name = sc.nextLine();
        System.out.print("Department: ");
        e.department = sc.nextLine();

        e.displayDetails();

        System.out.println();

        Employee m = new Manager();

        System.out.println("Enter Manager details:");
        System.out.print("Name: ");
        m.name = sc.nextLine();
        System.out.print("Department: ");
        m.department = sc.nextLine();

        ((Manager)m).teamSize = sc.nextInt();
        sc.nextLine();
        System.out.print("Project: ");
        ((Manager)m).project = sc.nextLine();

        m.displayDetails();
    }
}
