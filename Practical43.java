/**Create a file named students.txt. Write at least three student records (roll number, name, marks) into the file. Read the file content and display all student records on the console. Handle exceptions like IOException properly using try-catch-finally.*/

import java.io.*;
class StudentFile {
 	public static void main(String[] args) {
 		System.out.println("Dhruvi Patel");
		System.out.println("240390107027");
 		FileWriter fw = null;
 		BufferedReader br = null;
 		try {
 			fw = new FileWriter("students.txt");
 			fw.write("101 Dhruvi 85\n");
 			fw.write("102 Trusha 78\n");
 			fw.write("103 Krisha 90\n");
 			fw.close();
 			br = new BufferedReader(new FileReader("students.txt"));
 			String line;
 			System.out.println("Student Records:\n");
			while ((line = br.readLine()) != null) {
 				System.out.println(line);
 			}
 		} catch (IOException e) {
 			System.out.println("Error: " + e);
 		} finally {
 			try {
 				if (fw != null) fw.close();
 				if (br != null) br.close();
 			} catch (IOException e) {
 				System.out.println("Error closing file");
			}
		}
	}
}