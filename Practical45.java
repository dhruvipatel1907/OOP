/**Write a Java program that takes file name(s) and commands from the command line arguments and performs the following operations:
Copy a file from source to destination.
Delete a given file.
Rename a file.
After performing the operation, the program should print the following file properties:
File name
Absolute path
File size (in bytes)
Whether the file is readable/writable
Last modified date
Use File class methods for properties, and handle exceptions such as IOException and
FileNotFoundException.*/

import java.io.*;
import java.util.Date;
class FileOperations {
	public static void main(String[] args) {
 		System.out.println("Dhruvi Patel");
		System.out.println("240390107027");
 		if (args.length < 2) {
 			System.out.println("Invalid arguments");
 			return;
 		}
 		String command = args[0];
 		try {
 			if (command.equalsIgnoreCase("copy")) {
 				if (args.length < 3) {
 					System.out.println("Usage: copy source destination");
 					return;
 				}
	 		File source = new File(args[1]);
 			File dest = new File(args[2]);
 			if (!source.exists()){
				System.out.println("Source file not found");
 				return;
 			}
 			if (dest.exists()) {
 				System.out.println("Destination file already exists, overwriting...");
 			}
 			try (FileInputStream fis = new FileInputStream(source);
 			FileOutputStream fos = new FileOutputStream(dest)) {
 			int ch;
 			while ((ch = fis.read()) != -1) {
 				fos.write(ch);
 			}
 		}
 		System.out.println("File copied successfully");
 		display(dest);
 		}else if (command.equalsIgnoreCase("delete")) {
 			File f = new File(args[1]);
 			if (!f.exists()) {
 				System.out.println("File does not exist");
 				return;
 			}
 			if (f.delete()) {
 				System.out.println("File deleted successfully");
 			} else {
 				System.out.println("Unable to delete file");
 			}
 			display(f);
 		}else if (command.equalsIgnoreCase("rename")) {
 			if (args.length < 3) {
 				System.out.println("Usage: rename oldName newName");
 				return;
 			}
 			File f1 = new File(args[1]);
 			File f2 = new File(args[2]);
 			if (!f1.exists()) {
				System.out.println("Source file does not exist");
 				return;
 			}
 			if (f1.renameTo(f2)) {
 				System.out.println("File renamed successfully");
 				display(f2);
 			} else {
 				System.out.println("Rename failed");
 			}
 		}else {
 			System.out.println("Invalid command");
 		}
 		} catch (FileNotFoundException e) {
 			System.out.println("File not found");
 		} catch (IOException e) {
 			System.out.println("Error handling file");
 		}
	}
	static void display(File f) {
 		System.out.println("\nFile Properties:");
 		System.out.println("Name: " + f.getName());
 		System.out.println("Absolute Path: " + f.getAbsolutePath());
 		System.out.println("Size: " + f.length() + " bytes");
 		System.out.println("Readable: " + f.canRead());
 		System.out.println("Writable: " + f.canWrite());
 		System.out.println("Exists: " + f.exists());
 		System.out.println("Last Modified: " + new Date(f.lastModified()));
 	}
}
