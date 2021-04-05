import java.util.Scanner;
class CalculateUsingMethodsWithParameters{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter two numbers");

		int firstNum = scan.nextInt();
		int secondNum = scan.nextInt();

		new CalculateUsingMethodsWithParameters().add(firstNum, secondNum);
	}

	void add(int firstNum, int secondNum){
		int result = firstNum + secondNum;

		System.out.println("Addition : " + result);
	}
}