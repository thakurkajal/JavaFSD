// Memory Management 
// 	- Garbage Collection



// 	// delete(obj); No such way exists in Java

// Ways of making an object eligible for Garbage Collection in Java:
// 	- Nulling a Reference 
//  - Reassigning a Reference
//  - When an object goes out of context

class GCDemo{
	int var;
	public static void main(String[] args) {
		GCDemo demo = new GCDemo();
		demo.var = 7432;
		demo.met();
		demo.met();

		// Reassign the reference
		// demo = new GCDemo();

		// I no longer need the object reffered to by demo, hence I null the reference
		// demo = null;
	}

	void met(){
		GCDemo ot = new GCDemo();
		ot.var = 987;
		System.out.println("ot's var: " + ot.var); //987

		System.gc();//A request for GC to run
	}
}

demo ------>Object(var=7432) 
Object(var=987) - Eligible for GC
Object(var=987) - Eligible for GC

