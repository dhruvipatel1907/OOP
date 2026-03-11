/**Create a Java class named University with a static data member totalStudents to keep track 
of the number of student objects created. Implement a static method getTotalStudents(). 
Also, include a static block to initialize a static variable (e.g., universityName) and an 
instance block to print a message when an object is created. Demonstrate their execution 
order.*/

import java.util.Scanner;

class University {

    static int totalStudents = 0;   
    static String universityName;   

    static {
        universityName = "Saffrony Institute of Technology";
        System.out.println("Static Block Executed");
        System.out.println("University Name: " + universityName);
    }

    {
        System.out.println("Instance Block Executed - A new student object is created");
    }

    University() {
        totalStudents++;
        System.out.println("Constructor Executed");
    }

    static int getTotalStudents() {
        return totalStudents;
    }
}

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        University[] u = new University[n];

        for (int i = 0; i < n; i++) {
            u[i] = new University();
        }

        System.out.println("Total Students Created: " + University.getTotalStudents());
    }
}