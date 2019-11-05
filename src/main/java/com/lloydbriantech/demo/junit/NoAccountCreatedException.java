package com.lloydbriantech.demo.junit;

/**
 * 
 * 
 */
public class NoAccountCreatedException extends Exception {
	
	private String msg;
	
	public NoAccountCreatedException(String msg) {
		super(msg);
		this.msg = msg;
	}
	
	public String getExceptionMessage() {
		return msg;
	}
}
