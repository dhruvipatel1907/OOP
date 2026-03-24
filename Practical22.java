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
        System.out.println("Name: Dhruvi Patel");
        System.out.println("Enrollment No: 240390107027");
        System.out.println();

        Triangle t = new Triangle();
        t.getData(10, 5);
        t.area();

        Rectangle r = new Rectangle();
        r.getData(4, 6);
        r.area();
    }
}