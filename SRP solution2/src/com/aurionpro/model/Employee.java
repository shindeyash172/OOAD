package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class Employee {
private int id;
private String name;
private double basicSalary;
private double hra;
private double da;
private double ta;


public Employee(int id, String name, double basicSalary, double hra, double da, double ta) {
	this.id = id;
	this.name = name;
	this.basicSalary = basicSalary;
	this.hra = hra;
	this.da = da;
	this.ta = ta;
}
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public double getBasicSalary() {
	return basicSalary;
}
public double getHra() {
	return hra;
}
public double getDa() {
	return da;
}
public double getTa() {
	return ta;
}
public void setId(int id) {
	this.id = id;
}
public void setName(String name) {
	this.name = name;
}
public void setBasicSalary(double basicSalary) {
	this.basicSalary = basicSalary;
}
public void setHra(double hra) {
	this.hra = hra;
}
public void setDa(double da) {
	this.da = da;
}
public void setTa(double ta) {
	this.ta = ta;
}

 public double calculateMonthlySalary() {
    double hraAmount = basicSalary * (hra / 100);
    double daAmount = basicSalary * (da/ 100);
    double taAmount = basicSalary * (ta/ 100);
    
    return basicSalary + hraAmount + daAmount + taAmount;
}
 public double calculateAnnualSalary() {
     return calculateMonthlySalary() * 12 ;
 }
}
