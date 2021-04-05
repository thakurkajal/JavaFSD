// Constructor
// 	- 

package kajal;
	class A{
		// A(){
		// 	System.out.println("Constructor called....");
		// }
		A(boolean b){
			System.out.println("Inside A(boolean)...");
		}
	}

	class ConstructorDemo{
		public static void main(String[] args) {
			A a = new A(true);
		}
	}