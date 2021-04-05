class StaticWork{

	static short s;
	byte b;


	public static void main(String[] args) {

		StaticWork ref = new StaticWork();
		StaticWork other = new StaticWork();

		// ClassName.staticMember;
		ref.s = 9; //StaticWork.s = 9;
		// System.out.println(StaticWork.s);
		System.out.println(other.s); //StaticWork.s
		// b = 8; //Error, because we haven't created the object yet
		// ref.func(); //StaticWork.func();
		func(); //StaticWork.func();
	}

	static void func(){
		System.out.println("Inside func..., s = " + StaticWork.s);
		this.met(); //Always an error
	}

	void met(){

	}
}
// static members of a class are loaded into memory at the
// time the class is loaded, i.e even before any objects
// of the class are created