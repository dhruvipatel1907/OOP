class Vehicle
{
    protected String vehicleNumber;
    protected String brand;
    protected String fuelType;

    Vehicle(String vNo, String b, String f)
    {
        vehicleNumber = vNo;
        brand = b;
        fuelType = f;
    }

    void displayDetails()
    {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Car extends Vehicle
{
    int numberOfSeats;
    boolean ACavailable;

    Car(String vNo, String b, String f, int seats, boolean ac)
    {
        super(vNo, b, f);
        numberOfSeats = seats;
        ACavailable = ac;
    }

    void displayDetails()
    {
        super.displayDetails();
        System.out.println("Number of Seats: " + numberOfSeats);
        System.out.println("AC Available: " + ACavailable);
    }
}

class ElectricCar extends Car
{
    int batteryCapacity;
    int chargingTime;

    ElectricCar(String vNo, String b, String f, int seats, boolean ac,
                int battery, int time)
    {
        super(vNo, b, f, seats, ac);
        batteryCapacity = battery;
        chargingTime = time;
    }

    void displayDetails()
    {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity);
        System.out.println("Charging Time: " + chargingTime);
    }
}

class MainClass
{
    public static void main(String[] args)
    {
        System.out.println("Name: Dhruvi Patel");
        System.out.println("Enrollment No: 240390107027");
        System.out.println();

        Vehicle v1 = new Vehicle("GJ01AB1234", "Tata", "Petrol");
        v1.displayDetails();

        System.out.println();

        Car c1 = new Car("GJ02CD5678", "Hyundai", "Diesel", 5, true);
        c1.displayDetails();

        System.out.println();

        ElectricCar e1 = new ElectricCar("GJ03EF9012", "Tesla", "Electric",
                                        5, true, 75, 2);
        e1.displayDetails();

        System.out.println();

        Vehicle v = new Car("GJ04GH3456", "Maruti", "Petrol", 4, false);
        v.displayDetails();

        System.out.println();

        if (v instanceof Car)
        {
            Car c = (Car) v;
            System.out.println("Accessing Car specific feature:");
            System.out.println("Seats: " + c.numberOfSeats);
        }
    }
}