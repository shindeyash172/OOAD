package com.aurionpro.test;

import com.aurionpro.model.Ostrich;
import com.aurionpro.model.Piegon;
import com.aurionpro.model.Sparrow;

public class Birdtest {
public static void main(String[] args) {
	Sparrow sparrow = new Sparrow();
	Piegon piegon = new Piegon();
	Ostrich ostrich = new Ostrich();

	sparrow.Fly();
	piegon.Fly();
	ostrich.Walk();
	
}
}
