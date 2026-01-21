/**Simulate a simple ATM or cashier. Given an integer amount to be dispensed (e.g., 787), 
calculate and display the minimum number of currency notes of denominations 100, 50, 10, 
5, 2, and 1 that would be given to the user.*/

import java.util.Scanner;

class Practical5{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount to be dispensed: ");
        int amount = sc.nextInt();

        int note100, note50, note10, note5, note2, note1;

        note100 = amount / 100;
        amount = amount % 100;

        note50 = amount / 50;
        amount = amount % 50;

        note10 = amount / 10;
        amount = amount % 10;

        note5 = amount / 5;
        amount = amount % 5;

        note2 = amount / 2;
        amount = amount % 2;

        note1 = amount;

        System.out.println("Currency Notes:");
        System.out.println("100 : " + note100);
        System.out.println("50  : " + note50);
        System.out.println("10  : " + note10);
        System.out.println("5   : " + note5);
        System.out.println("2   : " + note2);
        System.out.println("1   : " + note1);

        sc.close();
    }
}