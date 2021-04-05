// Scope
// 	- Access Specifiers
// 		- protected
// 		- public
// 		- private
// 		- packageprivate(Not a Keyword)



package kajal;

class A{
	public static void main(String[] args) {
		B ref = new B();	
		ref.func();
		//ref.v = 567; //Wont work
	}
}

public class B{
	private int v;
	 void func(){
		System.out.println("Inside B's func..., v :" + v);
	}
}


