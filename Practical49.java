/**Create a generic class Box<T> with a method addItem(T item) that stores items in an ArrayList<T>. Demonstrate the class by:

Creating a Box<String> for names.
Creating a Box<Integer> for roll numbers.
Display stored items for both.*/

import java.util.*;
class Box<T> {
 	ArrayList<T> items = new ArrayList<T>();
 	void addItem(T item) {
 		items.add(item);
	}
 	void displayItems() {
 		for (T item : items) {
 			System.out.println(item);
 		}
 	}
}

class BoxDemo {
 	public static void main(String[] args) {
 		System.out.println("Dhruvi Patel");
		System.out.println("240390107027");
 		Box<String> nameBox = new Box<String>();
 		nameBox.addItem("Dhruvi");
 		nameBox.addItem("Trusha");
 		nameBox.addItem("Krisha");
 		System.out.println("Names:");
 		nameBox.displayItems();
 		Box<Integer> rollBox = new Box<Integer>();
 		rollBox.addItem(101);
 		rollBox.addItem(102);
 		rollBox.addItem(103);
		System.out.println("\nRoll Numbers:");
		rollBox.displayItems();
 	}
}
