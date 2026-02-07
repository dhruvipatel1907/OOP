/**Define a Java class named Rectangle. It should have two double data fields: width and 
height, both with a default value of 1. Implement a no-argument constructor and a 
constructor that takes width and height as parameters. Include methods getArea() and 
getPerimeter() that return the calculated area and perimeter respectively.*/

class Rectangle
{
    double width = 1;
    double height = 1;

    Rectangle()
    {
    }

    Rectangle(double w, double h)
    {
        width = w;
        height = h;
    }

    double getArea()
    {
        return width * height;
    }

    double getPerimeter()
    {
        return 2 * (width + height);
    }

    public static void main(String[] args)
    {
        Rectangle obj1 = new Rectangle();
        System.out.println("Area: " + obj1.getArea());
        System.out.println("Perimeter: " + obj1.getPerimeter());

        Rectangle obj2 = new Rectangle(5, 10);
        System.out.println("Area: " + obj2.getArea());
        System.out.println("Perimeter: " + obj2.getPerimeter());
    }
}
