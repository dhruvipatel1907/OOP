/**Write a Java program to create an abstract class Vehicle with:
An abstract method fuelType() that returns the type of fuel used.
An abstract method noOfWheels() that returns the number of wheels.
Create two subclasses:
Car that uses Petrol/Diesel and has 4 wheels.
Bike that uses Petrol and has 2 wheels.
In the main method, create objects of Car and Bike, and display their fuel type and number
Of wheels.*/

abstract class Vehicle {
	abstract String fuelType();
	abstract int noOfWheels();
}

class Car extends Vehicle {
	String fuelType() {
		return "Petrol/Diesel";
	}
	int noOfWheels() {
 		return 4;
 	}
}

class Bike extends Vehicle {
	String fuelType() {
 		return "Petrol";
 	}
 	int noOfWheels() {
 		return 2;
 	}
}

class Fueltype {
	public static void main(String[] args) {
		System.out.println("Dhruvi Patel");
		System.out.println("240390107027");
		Vehicle v1 = new Car();
		Vehicle v2 = new Bike();
		System.out.println("\nCar Details:");
		System.out.println("Fuel Type: " + v1.fuelType());
		System.out.println("Number of Wheels: " + v1.noOfWheels());
		System.out.println("\nBike Details:");
		System.out.println("Fuel Type: " + v2.fuelType());
		System.out.println("Number of Wheels: " + v2.noOfWheels());
 	}
}
