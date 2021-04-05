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
	}
}

class B{
	void func(){
		System.out.println("Inside B's func...");
	}
}


