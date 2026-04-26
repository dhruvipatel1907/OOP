/**Write a program that accepts a sentence from the user and counts the frequency of each word using a HashMap<String, Integer>. Display the results in the format:
Input: "Java is fun and Java is powerful"
Output:
Java -> 2
is -> 2
fun -> 1
and -> 1
powerful -> 1*/

import java.util.*;
class WordFrequency {
 	public static void main(String[] args) {
 		System.out.println("Dhruvi Patel");
		System.out.println("240390107027");
 		Scanner sc = new Scanner(System.in);
 		System.out.print("Enter a sentence: ");
 		String input = sc.nextLine();
 		String[] words = input.split("\\s+");
 		HashMap<String, Integer> map = new HashMap<String, Integer>();
 		for (String word : words) {
 			if (map.containsKey(word)) {
 				map.put(word, map.get(word) + 1);
 			} else {
 				map.put(word, 1);
 			}
 		}
 		System.out.println("\nWord Frequency:");
 		for (String key : map.keySet()) {
 			System.out.println(key + " -> " + map.get(key));
 		}
 	}
}