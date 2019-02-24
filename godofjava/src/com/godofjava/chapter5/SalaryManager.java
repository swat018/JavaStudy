package com.godofjava.chapter5;

public class SalaryManager {
	public static void main(String[] args) {
		SalaryManager manager = new SalaryManager();
		System.out.println("Real monthlySalary = " + manager.getMonthlySalary(20000000));
	}
	public double getMonthlySalary(int yearlySalary) {
		double monthlySalary = yearlySalary / 12.0;
		System.out.println("MonthlySalary Original = "+monthlySalary);
		
		double tax = calculateTax(monthlySalary);
		System.out.println("MonthlySalary Tax = " + tax);
		double nationnalPension = calculateNationalPension(monthlySalary);
		System.out.println("MonthlySalary NationalPension = " + nationnalPension);
		double healthInsurnace = calculateHealthInsurance(monthlySalary);
		System.out.println("MonthlySalary HealthInsurance = " + healthInsurnace);
		
		double minusTotal = tax + nationnalPension + healthInsurnace;
		monthlySalary -= minusTotal;
		
		return monthlySalary;
	}
	public double calculateTax(double monthlySalary) {
		double tax = monthlySalary * (12.5 / 100);
		return tax;
	}
	public double calculateNationalPension(double monthlySalary) {
		double nationalPension = monthlySalary * (8.1 / 100);
		return nationalPension;
	}
	public double calculateHealthInsurance(double monthlySalary) {
		double healthInsurance = monthlySalary * (13.5 / 100);
		return healthInsurance;
	}
	
}
