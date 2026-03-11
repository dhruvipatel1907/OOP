/**Write a Java program that demonstrates method overloading to calculate the volume of 
different 3D shapes. Implement overloaded methods named calculateVolume() for a Cube 
(takes one side length), a RectangularCube (takes length, width, height), and a Sphere (takes 
radius).*/

import java.util.Scanner;

class VolumeCalculator {

    double calculateVolume(double side) {
        return side * side * side;
    }

    double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    double calculateVolume(float radius) {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dhruvi Patel");
        System.out.println("240390107027");

        VolumeCalculator v = new VolumeCalculator();

        System.out.print("Enter side of cube: ");
        double side = sc.nextDouble();
        System.out.println("Volume of Cube: " + v.calculateVolume(side));

        System.out.print("\nEnter length of rectangular cube: ");
        double l = sc.nextDouble();
        System.out.print("Enter width: ");
        double w = sc.nextDouble();
        System.out.print("Enter height: ");
        double h = sc.nextDouble();
        System.out.println("Volume of Rectangular Cube: " + v.calculateVolume(l, w, h));

        System.out.print("\nEnter radius of sphere: ");
        float r = sc.nextFloat();
        System.out.println("Volume of Sphere: " + v.calculateVolume(r));
    }
}