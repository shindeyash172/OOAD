package com.aurionpro.model;

public class SalarySlipPrinter {
		    public static void printSalarySlip(Employee employee) {
		    	    System.out.println("id"+employee.getId());
		    	    System.out.println("Name: " + employee.getName());
		    	    System.out.println("Basic Salary: " + employee.getBasicSalary());
		    	    System.out.println("HRA " + employee.getHra());
		    	    System.out.println("DA " + employee.getDa());
		    	    System.out.println("TA " + employee.getTa());
		    	    System.out.println("monthly salary:"+employee.calculateMonthlySalary());
		    	    System.out.println("Annual Salary " + employee.calculateAnnualSalary());
		    	    System.out.println("Total Tax " + annualtax.calculateAnnualTax(employee));
		    	}
	    
	}


