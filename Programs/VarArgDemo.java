class CalculateMultiply{
	int total = 1;
	void multiply(int... values){ // Thanks to Var-Args, this method
							     // can now take from 0-n int arguments
		if(values.length >= 2){
			for(int value : values){
				total *= value;
			}
		System.out.println("Multiplication of numbers : " + total);
		}
	}
}

class VarArgDemo{
	public static void main(String[] args) {
		new CalculateMultiply().multiply(10, 10, 10, 1);
	}
}