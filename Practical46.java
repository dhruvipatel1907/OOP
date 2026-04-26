/**Write a Java program that uses an ArrayList<Integer>; to store marks of students. Perform
the following operations:
● Add at least 5 marks.
● Display all marks.
● Find and display the highest and lowest marks using Collections.max() and
Collections.min().*/

import java.util.*;
class MarksList {
	public static void main(String[] args) {
 		System.out.println("Dhruvi Patel");
		System.out.println("240390107027");
 		ArrayList<Integer> marks = new ArrayList<Integer>();
 		marks.add(85);
 		marks.add(78);
 		marks.add(92);
 		marks.add(66);
 		marks.add(74);
 		System.out.println("Marks List:");
 		for (int m : marks) {
 			System.out.println(m);
 		}
 		int max = Collections.max(marks);
 		int min = Collections.min(marks);
 		System.out.println("\nHighest Marks: " + max);
 		System.out.println("Lowest Marks: " + min);
 	}
}