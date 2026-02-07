/**Create a class BankAccount with accountId (String), accountHolderName (String), and 
balance (double) as instance variables. Include methods assignValues() (for initialization) 
and displayValues(). Implement a search function that takes an accountId as input and, if 
found within an array of BankAccount objects, displays the details of that specific account. 
In your main method, create an array of at least five BankAccount objects and demonstrate 
adding, displaying, and searching for accounts.*/

import java.util.Scanner;

class BankAccount
{
    String accountId;
    String accountHolderName;
    double balance;

    void assignValues(String id, String name, double bal)
    {
        accountId = id;
        accountHolderName = name;
        balance = bal;
    }

    void displayValues()
    {
        System.out.println("Account ID: " + accountId);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    static void searchAccount(BankAccount[] acc, String id)
    {
        boolean found = false;

        for (int i = 0; i < acc.length; i++)
        {
            if (acc[i].accountId.equals(id))
            {
                acc[i].displayValues();
                found = true;
                break;
            }
        }

        if (!found)
        {
            System.out.println("Account not found");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        BankAccount[] accounts = new BankAccount[5];

        accounts[0] = new BankAccount();
        accounts[0].assignValues("A101", "Rahul", 5000);

        accounts[1] = new BankAccount();
        accounts[1].assignValues("A102", "Neha", 8000);

        accounts[2] = new BankAccount();
        accounts[2].assignValues("A103", "Amit", 12000);

        accounts[3] = new BankAccount();
        accounts[3].assignValues("A104", "Pooja", 7000);

        accounts[4] = new BankAccount();
        accounts[4].assignValues("A105", "Karan", 9000);

        System.out.println("All Account Details:");
        for (int i = 0; i < accounts.length; i++)
        {
            accounts[i].displayValues();
            System.out.println();
        }

        System.out.print("Enter Account ID to search: ");
        String searchId = sc.nextLine();

        searchAccount(accounts, searchId);
    }
}
