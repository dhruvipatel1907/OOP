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
        System.out.println("Name: Dhruvi Patel");
        System.out.println("Enrollment No: 240390107027");
        System.out.println();

        Employee e = new Employee();
        e.displayDetails();

        System.out.println();

        Employee m = new Manager();  
        m.displayDetails();
    }
}