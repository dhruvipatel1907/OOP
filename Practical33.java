/**Take the value of denominator and numerator from user using command-line argument.
Implement the concept of exception handling to manage all possible run-time error.*/

class Division {
	public static void main(String[] args) {
 		System.out.println("Dhruvi Patel");
		System.out.println("240390107027");
 		
		try {
 			int numerator = Integer.parseInt(args[0]);
 			int denominator = Integer.parseInt(args[1]);
 			int result = numerator / denominator;
 			System.out.println("Result: " + result);
 		}
 		
		catch (ArithmeticException e) {
			System.out.println("Error: Cannot divide by zero");
 		}
 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: Please provide two arguments");
		}
 
		catch (NumberFormatException e) {
			System.out.println("Error: Enter valid integers only");
 		}
 	}
}
