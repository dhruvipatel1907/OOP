/**Write the Java code for an interface named Exam which declares a single abstract method
boolean isPassed (int mark). This method should take an integer mark as an argument. Write
the Java code for another interface named Classify which declares a single abstract method
String getDivision(double average). This method should take a double average as an
argument. Create a class named Result that implements both the Exam and Classify
interfaces. Provide concrete implementations for isPassed() and getDivision() methods. In
your main method, create an instance of Result, set some marks and average, and
demonstrate the use of both interface methods.*/

interface Exam {
	boolean isPassed(int mark);
}

interface Classify {
	String getDivision(double average);
}

class Result implements Exam, Classify {
	@Override
	public boolean isPassed(int mark) {
		return mark >= 40;
	}

	@Override
	public String getDivision(double average) {
		if (average >= 60) {
			return "First Division";
		}else{
 			return "Below First Division";
 		}
 	}
}

class ResultApp {
	public static void main(String[] args) {
		System.out.println("Dhruvi Patel");
		System.out.println("240390107027");
		Result r = new Result();
		int mark = 55;
 		double avg = 65.5;
		System.out.println("Passed: " + r.isPassed(mark));
		System.out.println("Division: " + r.getDivision(avg));
	}
}
