import java.util.Scanner;
class MethodWorkDemo{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter two numbers");

		int firstNum = scan.nextInt();
		int secondNum = scan.nextInt();

		int result = firstNum + secondNum;

		System.out.println("Addition of numbers is : " + result);
	}
}
