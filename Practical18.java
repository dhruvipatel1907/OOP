/**Design a class BankAccount with account_holder_name and balance. Use a static variable 
interest_rate (same for all accounts). Include methods to calculate and display the interest 
earned. Update interest rate using a static method.*/

import java.util.Scanner;

class BankAccount {

    String account_holder_name;
    double balance;

    static double interest_rate = 5.0;   
    
    BankAccount(String name, double bal) {
        account_holder_name = name;
        balance = bal;
    }

    void calculateInterest() {
        double interest = (balance * interest_rate) / 100;
        System.out.println("Account Holder: " + account_holder_name);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Earned: " + interest);
    }

    static void updateInterestRate(double newRate) {
        interest_rate = newRate;
        System.out.println("New Interest Rate Updated to: " + interest_rate + "%");
    }
}

class Main {
	System.out.println("Dhruvi Patel");
	System.out.println("240390107027");
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of accounts: ");
        int n = sc.nextInt();
        sc.nextLine();

        BankAccount[] acc = new BankAccount[n];

        for (int i = 0; i < n; i++) {

            System.out.print("Enter Account Holder Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Balance: ");
            double bal = sc.nextDouble();
            sc.nextLine();

            acc[i] = new BankAccount(name, bal);
        }

        System.out.print("Enter new interest rate: ");
        double newRate = sc.nextDouble();

        BankAccount.updateInterestRate(newRate);

        System.out.println("\n--- Interest Details ---");

        for (int i = 0; i < n; i++) {
            acc[i].calculateInterest();
            System.out.println();
        }
    }
}