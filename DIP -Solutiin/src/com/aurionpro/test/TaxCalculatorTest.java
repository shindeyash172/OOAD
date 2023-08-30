package com.aurionpro.test;

import com.aurionpro.model.DBLogger;
import com.aurionpro.model.Fileloger;
import com.aurionpro.model.TaxCalculator;

public class TaxCalculatorTest {

	public static void main(String[] args) {
		TaxCalculator t1 = new TaxCalculator(new DBLogger());
		t1.calculateTax(100, 0);
		
		TaxCalculator t2 = new TaxCalculator(new Fileloger());
		t2.calculateTax(2000, 0);
	}

}
