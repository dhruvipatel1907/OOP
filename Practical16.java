/**A bank wants to offer a facility to calculate EMI (Equated Monthly Installment) for 
different types of loans. Design a class LoanCalculator with the following overloaded 
methods: 
calculateEMI(int principal, int time, float rate): For home loans 
calculateEMI(double principal, int time, double rate): For vehicle loans 
calculateEMI(int principal, int time): For short-term personal loans with a fixed interest 
rate of 10% 
Demonstrate the use of all three methods in the main method by calculating EMIs for 
different loan types.*/

class LoanCalculator
{
    void calculateEMI(int principal, int time, float rate)
    {
        float emi = (principal * rate * time) / 100;
        System.out.println("Home Loan EMI: " + emi);
    }

    void calculateEMI(double principal, int time, double rate)
    {
        double emi = (principal * rate * time) / 100;
        System.out.println("Vehicle Loan EMI: " + emi);
    }

    void calculateEMI(int principal, int time)
    {
        float rate = 10;
        float emi = (principal * rate * time) / 100;
        System.out.println("Personal Loan EMI: " + emi);
    }

    public static void main(String[] args)
    {
        LoanCalculator lc = new LoanCalculator();

        lc.calculateEMI(500000, 20, 8.5f);      
        lc.calculateEMI(300000.0, 5, 9.2);      
        lc.calculateEMI(100000, 2);             
    }
}
