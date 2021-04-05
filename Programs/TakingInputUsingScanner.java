// import the Scanner class from java.util
import java.util.Scanner;
class TakingInputUsingScanner{
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner scan = new Scanner(System.in);

		// Ask the user to enter two numbers
		System.out.println("Please enter two numbers");

		int firstNum = scan.nextInt();
		int secondNum = scan.nextInt();
		scan.nextLine();

		int result = firstNum + secondNum;

		System.out.println("Addition of numbers is : " + result);

		System.out.println("Please enter your name");

		String userName = scan.nextLine();

		System.out.println("Welcome " + userName);
	}
}