/**Develop a Java application that calculates a person's Body Mass Index (BMI). The program 
should ask the user for their weight in pounds and height in inches. Convert these values to 
kilograms and meters respectively (1 pound = 0.45359237 kg, 1 inch = 0.0254 meters) and 
then calculate BMI (weight in kg / (height in meters)^2). Display the calculated BMI.*/

import java.util.Scanner;
class Practical4{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter weight in pounds: ");
		double weightPound = sc.nextDouble();

		System.out.println("Enter height in inches: ");
		double heightInches = sc.nextDouble();

		double weightKg = weightPound * 0.45359237;
		double heightMeter = heightInches * 0.0254;
		double BMI = (weightKg/(heightMeter * heightMeter));

		System.out.println("Your BMI is:" +BMI);
		sc.close();
	}

}