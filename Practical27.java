/**Given an interface Classify with a method String getDivision(double average). Implement this getDivision method in a class Result such that it returns “First Division” if the average is 60 or more.*/

interface Classify {
	String getDivision(double average);
}

class Result implements Classify {
	@Override
	public String getDivision(double average) {
		if (average >= 60) {
			return "First Division";
		} else {
			return "Below First Division";
		}
 	}
}

class Result1 {
	public static void main(String[] args) {
		System.out.println("Dhruvi Patel");
		System.out.println("240390107027");
		Result r = new Result();
		System.out.println(r.getDivision(75)); 
	}
}
