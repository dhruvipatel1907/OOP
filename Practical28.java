class Result implements Exam, Classify
{
    public boolean isPassed(int mark)
    {
        if (mark >= 40)
            return true;
        else
            return false;
    }

    public String getDivision(double average)
    {
        if (average >= 60)
            return "First Division";
        else
            return "No First Division";
    }

    public static void main(String[] args)
    {
        System.out.println("Name: Dhruvi Patel");
        System.out.println("Enrollment No: 240390107027");
        System.out.println();

        Result r = new Result();

        int mark = 55;
        double avg = 65.5;

        if (r.isPassed(mark))
            System.out.println("Result: Passed");
        else
            System.out.println("Result: Failed");

        System.out.println("Division: " + r.getDivision(avg));
    }
}

interface Exam
{
    boolean isPassed(int mark);
}

interface Classify
{
    String getDivision(double average);
}