package com.aurionpro.model;

public class DBLogger implements Ilogger {

	@Override
	public void log(String err) {
		System.out.println("Logged to database: "+err);
	}

	
}