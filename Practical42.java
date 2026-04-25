/**Write a program that will count the number of characters, words, and lines in a file. Words are separated by whitespace characters. The file name should be passed as a command-line argument*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class FileCount {
	public static void main(String[] args) throws IOException {
		System.out.println("Dhruvi Patel");
		System.out.println("240390107027");
		if (args.length == 0) {
 			System.out.println("Please provide file name as argument");
 			return;
 		}
 		BufferedReader br = new BufferedReader(new FileReader(args[0]));
 		int characters = 0;
		int words = 0;
 		int lines = 0;
 		String line;
 		while ((line = br.readLine()) != null) {
 			lines++;
 			characters += line.length();
 			String[] wordList = line.trim().split("\\s+");
 			if (line.trim().length() > 0) {
 				words += wordList.length;
 			}
 		}
 		br.close();
 		System.out.println("Lines: " + lines);
 		System.out.println("Words: " + words);
 		System.out.println("Characters: " + characters);
	}
}