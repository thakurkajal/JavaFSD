class CalculateMultiplication{
	int multiply(int first, int second){
		return first * second;
	}

	int multiply(int first, int second, int third){
		return first * second * third;
	}

	int multiply(int first, int second, int third, int fourth){
		return first * second * third * fourth;
	}
}

class MethodOverloadingDemo{
	public static void main(String[] args) {
		System.out.println("Result : " + new CalculateMultiplication().multiply(34, 24));
	}
}