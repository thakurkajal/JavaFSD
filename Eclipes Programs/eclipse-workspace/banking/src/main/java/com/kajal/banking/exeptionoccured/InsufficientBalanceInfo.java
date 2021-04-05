package com.kajal.banking.exeptionoccured;

public class InsufficientBalanceInfo extends RuntimeException{
	public InsufficientBalanceInfo(String msg) {
		super(msg);
	}
}
