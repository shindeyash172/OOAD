package com.aurionpro.model;

public class TaxCalculator {

	private Ilogger logger;
	
	public TaxCalculator(Ilogger logger) {
		super();
		this.logger = logger;
	}

	public Ilogger getLogger() {
		return logger;
	}

	public void setLogger(Ilogger logger) {
		this.logger = logger;
	}

	public int calculateTax(int amount, int rate) {
		int tax=0;
		try {
			tax=amount/rate;
			System.out.println(tax);
		} catch(Exception e) {
			logger.log("Divided by Zero");
		}
		return tax;
	}
}