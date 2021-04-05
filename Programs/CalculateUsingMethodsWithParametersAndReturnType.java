import java.util.Scanner;
class CalculateUsingMethodsWithParametersAndReturnType{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter two numbers");

		int firstNum = scan.nextInt();
		int secondNum = scan.nextInt();

		System.out.println("Addition: " + new CalculateUsingMethodsWithParametersAndReturnType().add(firstNum, secondNum));
	
	}

	int add(int firstNum, int secondValue){
		return (firstNum + secondValue);
		// Unreachable code
	}
}