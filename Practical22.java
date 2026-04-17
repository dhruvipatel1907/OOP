/**Design a base class Shape with two double data members d1 and d2 to store dimensions.
Include a method getData(double d1, double d2) to initialize these dimensions. Create two
derived classes, Triangle and Rectangle, which inherit from Shape. Each derived class
should have its own method to calculate its specific area.*/

import java.util.Scanner;

class Shape
{
    double d1, d2;

    void getData(double a, double b)
    {
        d1 = a;
        d2 = b;
    }
}

class Triangle extends Shape
{
    void area()
    {
        double area = (d1 * d2) / 2;
        System.out.println("Area of Triangle: " + area);
    }
}

class Rectangle extends Shape
{
    void area()
    {
        double area = d1 * d2;
        System.out.println("Area of Rectangle: " + area);
    }
}

class MainClass
{
    public static void main(String[] args)
    {
        System.out.println("Dhruvi Patel");
        System.out.println("240390107027");
        System.out.println();

        Scanner sc = new Scanner(System.in);

        Triangle t = new Triangle();
        System.out.println("Enter base and height for Triangle:");
        double t1 = sc.nextDouble();
        double t2 = sc.nextDouble();
        t.getData(t1, t2);
        t.area();

        System.out.println();

        Rectangle r = new Rectangle();
        System.out.println("Enter length and breadth for Rectangle:");
        double r1 = sc.nextDouble();
        double r2 = sc.nextDouble();
        r.getData(r1, r2);
        r.area();
    }
}
