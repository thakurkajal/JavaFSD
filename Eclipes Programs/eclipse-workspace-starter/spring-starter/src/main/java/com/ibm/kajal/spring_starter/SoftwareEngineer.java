package com.ibm.kajal.spring_starter;

public class SoftwareEngineer {
		private Address theAddress;
		private SystemEngineer systemEngineer;
		
		public SystemEngineer getSystemEngineer() {
			return systemEngineer;
		}



		public void setSystemEngineer(SystemEngineer systemEngineer) {
			this.systemEngineer = systemEngineer;
		}


		public Address getTheAddress() {
			return theAddress;
		}



		public void setTheAddress(Address theAddress) {
			this.theAddress = theAddress;
		}



		public void workForWages() {
			System.out.println("Software Enginners work for wages at location with pincode is : ");
			System.out.println(this.getTheAddress().getLocation() + " " + this.getTheAddress().getPincode());
			System.out.println(this.getSystemEngineer().getLocation());
		}
}
