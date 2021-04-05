
	// Human - sleep, eat, run, walk, smile, breathe (Code/Funtions/Methods)
	// 	  - brain, heart, legs, arms, ears, eyes, mouth (Data/Variables)

	// Object  



	class Human{

		int brain, legs;

		String arms, eyes;

		void sleep(){
			System.out.println("Inside Human's sleep");
		}
		void breathe(){
			System.out.println("Inside Human's breathe");	}
		void walk(){
			System.out.println("Inside Human's walk");
		}
	}


	class ClassObjectDemo{
		public static void main(String[] args) {
			// Create an Object of Human
			Human ref = new Human();

			// Call methods on it
			ref.breathe();
			ref.sleep();
			ref.walk();
		}
	}



	// Type identifier = new Type();

	// Human ref = new Human();

	// ref.breathe();
	// ref.walk();
	// ref.legs = 2;
	// ref.brain = 1;

	// Human ref;
	// ref.breathe(); // Produces an error
	// ref = new Human();


	// new Human().breathe(); //Perfectly valid







