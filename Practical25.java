/**Create a base class named Vehicle that contains common attributes such as vehicleNumber, brand, and fuelType. Include a constructor to initialize these fields and a method displayDetails() to print them. Derive a subclass Car from Vehicle which adds attributes such as numberOfSeats and ACavailable (boolean). Override the displayDetails() method to include the car-specific details, and use the super keyword to invoke the parent class constructor and methods. Further, derive another subclass ElectricCar from Car that includes attributes such as batteryCapacity and chargingTime, and again override the displayDetails() method to include electric car-specific details. Demonstrate constructor chaining, method overriding, use of protected access specifier for inherited members, and instanceof operator to check object type at runtime. In the main() method, create objects of all three classes and display their details using overridden methods. Also, use upcasting (Vehicle v = new Car(...)) and downcasting with instanceof check to access subclass- specific features.*/

import java.util.Scanner;
class Vehicle {
 	protected String vehicleNumber;
 	protected String brand;
 	protected String fuelType;
 	public Vehicle(String vehicleNumber, String brand, String fuelType) {
 		this.vehicleNumber = vehicleNumber;
 		this.brand = brand;
 		this.fuelType = fuelType;
 	}
 
	public void displayDetails() {
 		System.out.println("Vehicle Number: " + vehicleNumber);
 		System.out.println("Brand: " + brand);
 		System.out.println("Fuel Type: " + fuelType);
	}
}

class Car extends Vehicle {
	protected int numberOfSeats;
 	protected boolean ACavailable;
 	public Car(String vehicleNumber, String brand, String fuelType, int numberOfSeats, boolean ACavailable) {
 		super(vehicleNumber, brand, fuelType);
 		this.numberOfSeats = numberOfSeats;
 		this.ACavailable = ACavailable;
	}

	public void displayDetails() {
 		super.displayDetails();
 		System.out.println("Number of Seats: " + numberOfSeats);
 		System.out.println("AC Available: " + (ACavailable ? "Yes" : "No"));
 	}
}

class ElectricCar extends Car {
	private double batteryCapacity;
 	private double chargingTime;
 	public ElectricCar(String vehicleNumber, String brand, String fuelType, int numberOfSeats, boolean ACavailable, double batteryCapacity, double chargingTime) {
 		super(vehicleNumber, brand, fuelType, numberOfSeats, ACavailable);
 		this.batteryCapacity = batteryCapacity;
 		this.chargingTime = chargingTime;
	}
 	public void displayDetails() {
 		super.displayDetails();
 		System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
 		System.out.println("Charging Time: " + chargingTime + " hours");
 	}
	public void ecoMode() {
 		System.out.println("Eco Mode Activated!");
 	}
}

class VehicleSystem {
	public static void main(String[] args) {
		System.out.println("Dhruvi Patel");
		System.out.println("240390107027");
		
		Vehicle v1 = new Vehicle("GJ02AD1999", "i20", "Petrol");
		System.out.println("----- Vehicle Details -----");
		v1.displayDetails();
		System.out.println("----------------------------");
		
		Vehicle v2 = new Car("GJ02CD5678", "Suzuki", "Diesel", 5, true);
		System.out.println("----- Car Details (Upcasting) -----");
		v2.displayDetails();
 		System.out.println("----------------------------");
 
		ElectricCar e1 = new ElectricCar("GJ03EF9101", "Mahindra", "Electric", 5, true, 40.5, 6.5);
	
		System.out.println("----- Electric Car Details -----");
 		e1.displayDetails();
		System.out.println("----------------------------");
		if (v2 instanceof Car) {
 			Car c = (Car) v2;
			System.out.println("Downcasting Successful. Seats: " + c.numberOfSeats);
 		}
 		if (e1 instanceof ElectricCar) {
 			e1.ecoMode();
 		}
 	}
}
