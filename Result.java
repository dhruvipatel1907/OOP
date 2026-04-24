/**Write a Java program using packages to generate a mark sheet for students.
Create a package student that contains a class Student with the following:
● Data members: rollNo, name.
● A constructor to initialize student details.
● A method displayStudent() to display student information.
Create another package exam that contains a class Result which:
● Extends the Student class.
● Has data members: marks1, marks2, marks3.
● A method displayResult() that prints the student’s mark sheet including total and
average marks.
In the main method (inside the exam package), create a student with marks and display the
mark sheet.*/

package exam;
import student.Student;
class Result extends Student {
	int m1, m2, m3;
	public Result(int rollNo, String name, int m1, int m2, int m3) {
		super(rollNo, name);
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}

	public void displayResult() {
		displayStudent();
 		int total = m1 + m2 + m3;
 		double avg = total / 3.0;
 		System.out.println("Marks1: " + m1);
 		System.out.println("Marks2: " + m2);
 		System.out.println("Marks3: " + m3);
 		System.out.println("Total: " + total);
 		System.out.println("Average: " + avg);
	}

	public static void main(String[] args) {
		System.out.println("Dhruvi Patel");
		System.out.println("240390107027");
		Result r = new Result(101, "Krisha", 80, 75, 90);
		r.displayResult();
	}
}