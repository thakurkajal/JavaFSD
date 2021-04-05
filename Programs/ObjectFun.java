class ObjectFun{
	double var;
	public static void main(String[] args) {
		ObjectFun first = new ObjectFun();
		ObjectFun second = new ObjectFun();
		ObjectFun third = first.met(second);

		System.out.println(second.var);



		// fun.var = 19.0;
		// fun.met(new ObjectFun());

	}

	ObjectFun met(ObjectFun temp){
		temp.var = 908.87;
		this.var = 456.98;
		return temp;
	}
}



    // first------>Object(var = 456.98)
    // second------>Object(var = 908.87)<------third
		