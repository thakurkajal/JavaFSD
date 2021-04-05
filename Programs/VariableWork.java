class VariableWork{
	public static void main(String[] args) {
		
		// Variable Declaration
		boolean flag = true, b;

		// int var = 987;

		float id = 678.90f;


		int var = (int) id;// Explicit Type cast from float to int

		double d = var; // No casting required, implicit casting done for us automatically


		// Variable Initialization
		// flag = false;

		// Print out the value
		System.out.println("Value of d : " + d);

	}
}

// Narrowing : Explicit Type Cast
// Widening : No Explicit Type Cast Required

// DataTypes
// 	- boolean : 1 (true/false)
// 	- byte : 1
// 	- short : 2
// 	- char : 2 (For storing characters)
// 	- int : 4
// 	- long : 8
// 	- float : 4
// 	- double : 8