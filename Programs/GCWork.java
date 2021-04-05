class GCWork{
	GCWork work;
	public static void main(String[] args) {
		GCWork a = new GCWork();
		GCWork b = new GCWork();
		GCWork c = new GCWork();

		// a.work = b;
		// b.work = c;
		// c.work = a;

		a = b = c = null;


		// How many objects are created and how many of them
		// are eligible for GC when we reach this line
		
	}
}

