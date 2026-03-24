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
        System.out.println("Name: Dhruvi Patel");
        System.out.println("Enrollment No: 240390107027");
        System.out.println();

        SavingAccount s = new SavingAccount();
        s.openAccount("S101", "Dhruvi", 5000);
        s.deposit(1000);
        s.withdraw(500);
        s.checkBalance();
        s.calculateInterest();

        System.out.println();

        FixedDepositAccount f = new FixedDepositAccount();
        f.openAccount("F201", "Dhruvi", 10000);
        f.checkBalance();
        f.maturityAmount();
    }
}