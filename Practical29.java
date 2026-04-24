/**Design a Java program for an Online Order Processing System using partial interface
implementation. Create an interface Order with three methods:
placeOrder(String item, int qty)
cancelOrder(int orderId)
generateBill()
Create an abstract class PartialOrder that implements the Order interface but provides implementation only for placeOrder() (storing order details). Create a concrete class FinalOrder that extends PartialOrder and implements the remaining methods cancelOrder() and generateBill(). Accept user input for order details and allow user to either generate a bill or cancel the order.
*/

import java.util.Scanner;
interface Order {
	void placeOrder(String item, int qty);
	void cancelOrder(int orderId);
	void generateBill();
}

abstract class PartialOrder implements Order {
	String itemName;
	int quantity;
 
	@Override
	public void placeOrder(String item, int qty) {
		itemName = item;
		quantity = qty;
		System.out.println("Order placed successfully!");
	}
}

class FinalOrder extends PartialOrder {
	int orderId = 101;
	double pricePerItem = 100;
 
	@Override
	public void cancelOrder(int orderId) {
		System.out.println("Order with ID " + orderId + " has been cancelled.");
	}
 
	@Override
	public void generateBill() {
		double total = quantity * pricePerItem;
 		System.out.println("----- BILL -----");
 		System.out.println("Item: " + itemName);
 		System.out.println("Quantity: " + quantity);
 		System.out.println("Price per item: " + pricePerItem);
 		System.out.println("Total Amount: " + total);
 	}
}

class OrderApp {
	public static void main(String[] args) {
 		System.out.println("Dhruvi Patel");
		System.out.println("240390107027");
 		Scanner sc = new Scanner(System.in);
 		FinalOrder order = new FinalOrder();
 		System.out.print("Enter item name: ");
 		String item = sc.nextLine();
 		System.out.print("Enter quantity: ");
 		int qty = sc.nextInt();
 		order.placeOrder(item, qty);
 		System.out.println("Enter 1 to Generate Bill or 2 to Cancel Order:");
 		int choice = sc.nextInt();
 		if (choice == 1) {
 			order.generateBill();
 		}else if (choice == 2) {
 			order.cancelOrder(order.orderId);
 		}else{
 			System.out.println("Invalid choice!");
 		}
		sc.close();
 	}
}
