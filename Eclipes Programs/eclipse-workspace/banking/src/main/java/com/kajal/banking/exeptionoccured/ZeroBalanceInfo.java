package com.kajal.banking.exeptionoccured;

public class ZeroBalanceInfo extends RuntimeException{
	public ZeroBalanceInfo() {
		
	}

	public ZeroBalanceInfo(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ZeroBalanceInfo(String message, Throwable cause) {
		super(message, cause);
	}

	public ZeroBalanceInfo(String message) {
		super(message);
	}

	public ZeroBalanceInfo(Throwable cause) {
		super(cause);
	}
}
