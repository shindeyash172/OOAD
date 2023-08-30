package com.aurionpro.test;

import com.aurionpro.model.Bird;
import com.aurionpro.model.Ostrich;
import com.aurionpro.model.Piegon;
import com.aurionpro.model.Sparrow;

public class Birdtest {
	public static void makeBirdFly(Bird bird) {
        bird.fly();
    }

    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        Ostrich ostrich = new Ostrich();
        Piegon piegon = new Piegon();

        makeBirdFly(sparrow); 
        makeBirdFly(ostrich); 
        makeBirdFly(piegon);
        
    }
}
