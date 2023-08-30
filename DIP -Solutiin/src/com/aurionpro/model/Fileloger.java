package com.aurionpro.model;

public class Fileloger implements Ilogger {

	@Override
	public void log(String err) {
		System.out.println("Logged to File: "+err);
	}

	
}
