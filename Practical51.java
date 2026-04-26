/**Write a generic method sortList(List<T> list) that sorts elements of an ArrayList<T>,
where T extends Comparable<T>. Demonstrate with:

An ArrayList<Integer> of numbers.
An ArrayList<String> of names.
Display the list before and after sorting.*/

import java.util.*;
class GenericSort {
 	public static <T extends Comparable<T>> void sortList(List<T> list) {
 		Collections.sort(list);
 	}
 
	public static void main(String[] args) {
 		System.out.println("Dhruvi Patel");
		System.out.println("240390107027");
 		ArrayList<Integer> numbers = new ArrayList<Integer>();
 		numbers.add(45);
 		numbers.add(12);
 		numbers.add(78);
 		numbers.add(23);
 		System.out.println("Numbers before sorting:");
 		System.out.println(numbers);
 		sortList(numbers);
 		System.out.println("Numbers after sorting:");
 		System.out.println(numbers);
 		ArrayList<String> names = new ArrayList<String>();
 		names.add("Krisha");
 		names.add("Mitul");
 		names.add("Trusha");
 		names.add("Dhruvi");
 		System.out.println("\nNames before sorting:");
 		System.out.println(names);
 		sortList(names);
		System.out.println("Names after sorting:");
		System.out.println(names);
	}
}