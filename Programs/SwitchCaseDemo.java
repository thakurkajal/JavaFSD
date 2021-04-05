class SwitchCaseDemo{
	public static void main(String[] args) {
		int var = 7;

		switch(var){
			case 3:
				System.out.println("THREE");
				break;
			case 7:
				System.out.println("SEVEN");
				break;
			case 1:
				System.out.println("ONE");
				break;
			default:
				System.out.println("No Match Found...");
		}
	}
}