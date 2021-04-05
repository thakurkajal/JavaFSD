class ConstructorWork{
	public static void main(String[] args) {
		Car theCar = new Car(62782, "i10");
		Car anotherCar = new Car(2652, "i10");

		System.out.println("anotherCar's details : " + anotherCar.chasisNo + ", name : " +theCar.name );
	
		Car car = new Car();
	}
}


class Car{
	long chasisNo;
	String name;

	Car(long chasisNo, String name){
		this.chasisNo = chasisNo;
		this.name = name;
		// new RTO().saveNewCarDetails(this.chasisNo);// Assume there is a RTO class
	}

	Car(){

	}
}