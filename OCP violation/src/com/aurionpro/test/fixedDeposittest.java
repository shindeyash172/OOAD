package com.aurionpro.test;

import com.aurionpro.model.FestivalType;
import com.aurionpro.model.fixedDeposit;

public class fixedDeposittest {
	public static void main(String[] args) {
		fixedDeposit fixed = new fixedDeposit(101, "RAM", 10000, 5, FestivalType.DIWALI);
		System.out.println(fixed);
}
}
