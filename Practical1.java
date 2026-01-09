/**Develop a Java program that prompts the user to enter a distance in meters. Your program 
should then convert this distance to feet (1 meter = 3.28084 feet) and display the result formatted to two decimal places. */

import java.util.Scanner;
class Practical1{
	public static void main(String [] ars){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter distance in meter :");
		double Distance = sc.nextDouble();
		double Feet = Distance*3.28084;
		System.out.printf("Your distance in feet : %.2f", Feet);
		
		sc.close();
	}

}