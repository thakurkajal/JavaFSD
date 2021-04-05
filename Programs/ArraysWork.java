class ArraysWork{
	public static void main(String[] args) {
		// Type []identifier = new Type[Dimension];

		int []arr = new int[5];

		arr[0] = 56;
		arr[1] = 243;
		arr[2] = 777;
		arr[3] = -9;
		arr[4] = 1010;
		// arr[5] = 3; //ArrayIndexOutOfBoundsException

		// System.out.println("Value at index 2 : " + arr[2]);

		// Traverse through the Array
		System.out.println("Values in array are : ");
		// for(int var = 0; var < arr.length; var++){
		// 	System.out.println(arr[var]);
		// 	}
		// }

		// Enhanced for-loop after Java 5.0
		// for(Variable Declaration : Name of the Array/Collection){

		// }

		// Traverse through the array using the enhanced for-loop
		for(int value : arr){
			System.out.println(value);
		}



		// // Alternate way to create arrays
		// boolean []ar = {false, true, true, false, true};

		// // Another way to create Arrays in Java - Annonymous Array inline creation
		// new []int{34, 22, 777, -9, 45, 44, 876}



}
}