/**Write a Java program that accepts a five-digit integer from the keyboard. Your program 
should then create a new number by adding one to each digit of the input number. For 
example, if the input is 12391, the output should be 23402 (note: 9+1=10, so it becomes 0 
with a carry)*/

import java.util.Scanner;

class Practical6{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a five-digit number: ");
        int num = sc.nextInt();

        int result = 0;
        int place = 1;
        int carry = 0;

        while (num > 0) {
            int digit = num % 10;
            digit = digit + 1 + carry;

            if (digit == 10) {
                digit = 0;
                carry = 1;
            } else {
                carry = 0;
            }

            result = result + (digit * place);
            place = place * 10;
            num = num / 10;
        }

        System.out.println("New number after adding 1 to each digit: " + result);

        sc.close();
    }
}
