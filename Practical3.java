/**Write a Java program that prompts the user to enter a single letter (character). Determine 
whether the entered character is a vowel (a, e, i, o, u, case-insensitive) or a consonant, and 
display the result.*/

import java.util.Scanner;

class Practical3
{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a single letter:");
		char ch = sc.next().charAt(0);

		ch = Character.toLowerCase(ch);

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            		System.out.println("The entered character is a Vowel.");
        	} else {
            		System.out.println("The entered character is a Consonant.");
        	}
	}
}