package com.aurionpro.test;

import com.aurionpro.model.fixedDeposit;
import com.aurionpro.model.holiIntrestRates;

public class FDtest {
public static void main(String[] args) {
	fixedDeposit fd = new fixedDeposit(10, "yash", 10000, 5, new holiIntrestRates());
	System.out.println(fd);
}
}
