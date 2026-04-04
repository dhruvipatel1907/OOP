abstract class Vehicle
{
    abstract String fuelType();
    abstract int noOfWheels();
}

class Car extends Vehicle
{
    String fuelType()
    {
        return "Petrol/Diesel";
    }

    int noOfWheels()
    {
        return 4;
    }
}

class Bike extends Vehicle
{
    String fuelType()
    {
        return "Petrol";
    }

    int noOfWheels()
    {
        return 2;
    }
}

class MainClass
{
    public static void main(String[] args)
    {
        System.out.println("Name: Dhruvi Patel");
        System.out.println("Enrollment No: 240390107027");
        System.out.println();

        Vehicle v1 = new Car();
        System.out.println("Car Details:");
        System.out.println("Fuel Type: " + v1.fuelType());
        System.out.println("Wheels: " + v1.noOfWheels());

        System.out.println();

        Vehicle v2 = new Bike();
        System.out.println("Bike Details:");
        System.out.println("Fuel Type: " + v2.fuelType());
        System.out.println("Wheels: " + v2.noOfWheels());
    }
}