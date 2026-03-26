import java.util.Scanner;

interface Classify
{
    String getDivision(double average);
}

class Result implements Classify
{
    public String getDivision(double average)
    {
        if (average >= 60)
        {
            return "First Division";
        }
        else
        {
            return "No First Division";
        }
    }
}

class MainClass
{
    public static void main(String[] args)
    {
        System.out.println("Name: Dhruvi Patel");
        System.out.println("Enrollment No: 240390107027");
        System.out.println();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter average marks: ");
        double avg = sc.nextDouble();

        Result r = new Result();
        String division = r.getDivision(avg);

        System.out.println("Division: " + division);
    }
}