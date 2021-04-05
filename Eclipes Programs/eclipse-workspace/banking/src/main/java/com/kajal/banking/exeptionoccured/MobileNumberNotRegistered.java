package com.kajal.banking.exeptionoccured;

public class MobileNumberNotRegistered extends RuntimeException{
	public MobileNumberNotRegistered() {
		
	}

	public MobileNumberNotRegistered(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public MobileNumberNotRegistered(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public MobileNumberNotRegistered(String arg0) {
		super(arg0);
	}

	public MobileNumberNotRegistered(Throwable arg0) {
		super(arg0);
	}
}
