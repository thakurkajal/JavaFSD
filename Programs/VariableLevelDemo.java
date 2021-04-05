
class VariableLevelDemo{
	// Create three instance variables
	int a, b;
	VariableLevelDemo ref;
	public static void main(String[] args) {
		VariableLevelDemo demo = new VariableLevelDemo();
		VariableLevelDemo r = new VariableLevelDemo();

		// System.out.println(demo.a); // Should print 0

		demo.a = 901;

		demo.func();

		// System.out.println(r.a); // Should print 0
	}





	
	void func(){
		// double var = 14.0;
		// System.out.println(var);
		int v;
		for(v = 1; v < 0; v++){
			System.out.println(v);
		}
			System.out.println(v); 

	}
	void add(){

	}
}


// boolean - false
// short
// byte
// int
// long ----- 0
// char - /u000
// float
// double --- 0.0

// null