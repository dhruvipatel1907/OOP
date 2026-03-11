/**Write a Java program to model a college admission system using the concept of inner 
classes. Create an outer class named College that stores the collegeName as a data member 
and initializes it through a constructor. Within the College class, define a non-static inner 
class named Admission that contains student-specific details such as the studentName and 
the course they are enrolling in. The inner class should have methods to accept and display 
student information, and it should also be able to access and display the collegeName stored 
in the outer class. In the main method, create an object of the College class by passing the collegeName, and then use this object to create an instance of the inner Admission class. 
Invoke appropriate methods to input the student’s name and course, and then display the 
complete admission details, including the college name.*/

import java.util.Scanner;

class College {

    String collegeName;

    College(String collegeName) {
        this.collegeName = collegeName;
    }

    class Admission {

        String studentName;
        String course;

        Scanner sc = new Scanner(System.in);

        void inputStudentDetails() {
            System.out.print("Enter Student Name: ");
            studentName = sc.nextLine();

            System.out.print("Enter Course: ");
            course = sc.nextLine();
        }

        void displayDetails() {

            System.out.println("College Name: " + collegeName);
            System.out.println("Student Name: " + studentName);
            System.out.println("Course Enrolled: " + course);
        }
    }
}

class Main {
    public static void main(String[] args) {

        System.out.println("Dhruvi Patel");
        System.out.println("240390107027");

	Scanner sc = new Scanner(System.in);

        System.out.print("Enter College Name: ");
        String cname = sc.nextLine();

        // Create object of outer class
        College c = new College(cname);

        // Create object of inner class
        College.Admission a = c.new Admission();

        // Call methods
        a.inputStudentDetails();
        a.displayDetails();
    }
}