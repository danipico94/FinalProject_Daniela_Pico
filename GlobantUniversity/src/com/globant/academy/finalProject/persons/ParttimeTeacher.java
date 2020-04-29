package com.globant.academy.finalProject.persons;

import com.globant.academy.finalProject.interfaces.Payroll;

public class ParttimeTeacher extends Teacher implements Payroll{
	private double actHrs;

	public ParttimeTeacher(String name, int id, int age, double baseSalary,double actHours) {
		super(name, id, age);
		super.setBaseSalary(baseSalary);
		this.setActHrs(actHours);
	}


	public double calculateFinalSalary(double baseSalary,double actHours) {
		double finalSalary = 0;
		double hrsSalary = (baseSalary/30) / 8;
		finalSalary = (hrsSalary * actHours) * 4;
		return finalSalary;
	}

	@Override
	public String toString() {
		return "---------------"+'\n'+ "Parttime Teacher name: " + getName() +'\n' + "Id: " + getId() +'\n'  + "Age: "
				+ getAge()+'\n'  + "Base Salary: " + getBaseSalary()  +'\n'  + "Active Hrs: " +getActHrs() 
				+'\n'  + "Final Salary: " +calculateFinalSalary(getBaseSalary(), getActHrs()) ;
	}



	public double getActHrs() {
		return actHrs;
	}



	public void setActHrs(double actHrs) {
		this.actHrs = actHrs;
	}
	
	

}
