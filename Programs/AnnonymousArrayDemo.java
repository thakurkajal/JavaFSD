class AnnonymousArrayDemo{
	public static void main(String[] args) {
		AnnonymousArrayDemo ref = new AnnonymousArrayDemo();
		ref.displayElementsOfArray(new int[]{456, 888, -98, 457, 77});





	}

	void displayElementsOfArray(int []arr){
		for (int value : arr) {
			System.out.println(value);
		}
	}
}