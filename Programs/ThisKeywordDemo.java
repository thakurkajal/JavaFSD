class ThisKeywordDemo{
	int var;
	public static void main(String[] args) {
		ThisKeywordDemo ref = new ThisKeywordDemo();
		ref.var = 109;
		ref.met();
	}

	void met(){
		System.out.println("Inside met...");
		this.var = 456;
		this.doSomething(); //this.doSomething()
	}

	void doSomething(){
		System.out.println("Inside doSomething, var : " + this.var);
	}
}

// this - CEO