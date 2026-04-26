/**Write a generic method searchElement that accepts a LinkedList<T> and an element T to
search. Return true if the element exists, otherwise false.

Test with LinkedList<Integer> for roll numbers.
Test with LinkedList<String> for names.*/

import java.util.*;
class GenericSearch {
 	public static <T> boolean searchElement(LinkedList<T> list, T element) {
 	return list.contains(element);
 	}

 	public static void main(String[] args) {
 		System.out.println("Dhruvi Patel");
		System.out.println("240390107027");
 		LinkedList<Integer> rollList = new LinkedList<Integer>();
 		rollList.add(101);
 		rollList.add(102);
 		rollList.add(103);
 		System.out.println("Searching Roll Number 102: " + searchElement(rollList, 102));
 		System.out.println("Searching Roll Number 105: " + searchElement(rollList, 105));
 		LinkedList<String> nameList = new LinkedList<String>();
 		nameList.add("Krisha");
 		nameList.add("Trusha");
 		nameList.add("Mitul");
 		System.out.println("\nSearching Name 'Krisha': " + searchElement(nameList, "Krisha"));
 		System.out.println("Searching Name 'Mitul': " + searchElement(nameList, "Mitul"));
 	}
}