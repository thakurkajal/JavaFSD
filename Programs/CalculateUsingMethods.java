class CalculateUsingMethods{
	public static void main(String[] args) {

		// Call add()
		new CalculateUsingMethods().add();
	}

	void add(){
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter two numbers");

		int firstNum = scan.nextInt();
		int secondNum = scan.nextInt();

		int result = firstNum + secondNum;

		System.out.println("Addition of numbers is : " + result);
	}
}
