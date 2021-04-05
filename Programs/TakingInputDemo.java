class TakingInputDemo{
	public static void main(String[] args) {
		// System.out.println("Welcome " + args[0]);

		int firstNum = Integer.parseInt(args[0]);
		int secondNum = Integer.parseInt(args[1]);

		int result = firstNum + secondNum;

		System.out.println("Addition of numbers is : " + result);
	}
}