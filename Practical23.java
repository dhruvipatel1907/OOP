/**Define a base class BankAccount with common attributes like accountNumber,
accountHolderName, and balance. Then, define two subclasses: SavingAccount and
FixedDepositAccount, which inherit from BankAccount. Implement basic operations like
openAccount(), deposit(), checkBalance(), and withdraw() in BankAccount. The
SavingAccount should include a calculateInterest() method specific to savings accounts,
and FixedDepositAccount should have a maturityAmount() method considering fixed
deposit terms.*/

import java.util.Scanner;

class BankAccount
{
    String accountNumber;
    String accountHolderName;
    double balance;

    void openAccount(String accNo, String name, double bal)
    {
        accountNumber = accNo;
        accountHolderName = name;
        balance = bal;
    }

    void deposit(double amount)
    {
        balance = balance + amount;
        System.out.println("Amount Deposited: " + amount);
    }

    void withdraw(double amount)
    {
        if (amount <= balance)
        {
            balance = balance - amount;
            System.out.println("Amount Withdrawn: " + amount);
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
    }

    void checkBalance()
    {
        System.out.println("Balance: " + balance);
    }
}

class SavingAccount extends BankAccount
{
    void calculateInterest()
    {
        double interest = balance * 0.04;
        System.out.println("Interest: " + interest);
    }
}

class FixedDepositAccount extends BankAccount
{
    void maturityAmount()
    {
        double rate = 0.06;
        int time = 2;
        double amount = balance + (balance * rate * time);
        System.out.println("Maturity Amount: " + amount);
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

        SavingAccount s = new SavingAccount();

        System.out.println("Enter Saving Account details:");
        System.out.print("Account Number: ");
        String accNo1 = sc.nextLine();
        System.out.print("Account Holder Name: ");
        String name1 = sc.nextLine();
        System.out.print("Initial Balance: ");
        double bal1 = sc.nextDouble();

        s.openAccount(accNo1, name1, bal1);

        System.out.print("Enter deposit amount: ");
        double dep = sc.nextDouble();
        s.deposit(dep);

        System.out.print("Enter withdraw amount: ");
        double wd = sc.nextDouble();
        s.withdraw(wd);

        s.checkBalance();
        s.calculateInterest();

        System.out.println();

        sc.nextLine();

        FixedDepositAccount f = new FixedDepositAccount();

        System.out.println("Enter Fixed Deposit Account details:");
        System.out.print("Account Number: ");
        String accNo2 = sc.nextLine();
        System.out.print("Account Holder Name: ");
        String name2 = sc.nextLine();
        System.out.print("Initial Balance: ");
        double bal2 = sc.nextDouble();

        f.openAccount(accNo2, name2, bal2);

        f.checkBalance();
        f.maturityAmount();
    }
}
