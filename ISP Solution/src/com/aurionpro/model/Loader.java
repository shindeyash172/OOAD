package com.aurionpro.model;

public class Loader implements IWorker {

	@Override
	public void start() {
		System.out.println("Labour  is working.");
	}

	@Override
	public void stop() {
		System.out.println("Labour stopped.");

	}

	@Override
	public void eat() {
		System.out.println("labour is eating.");

	}

	@Override
	public void rest() {
		System.out.println("labour is resting.");

	}

}
