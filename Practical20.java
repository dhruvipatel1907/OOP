import java.util.Scanner;

class Main {

    public static boolean isValidPassword(String password) {

        int digitCount = 0;

        if (password.length() < 8) {
            return false;
        }

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }

     
            if (Character.isDigit(ch)) {
                digitCount++;
            }
        }
 
        if (digitCount >= 2) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dhruvi Patel");
        System.out.println("240390107027");

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }
}