package com.globant.academy.finalProject.persons;

import java.util.List;

import com.globant.academy.finalProject.interfaces.Payroll;

public class FulltimeTeacher extends Teacher implements Payroll{

	private int expYears;


	public FulltimeTeacher(String name, int id, int age, double baseSalary,int expYears) {
		super(name, id, age);
		super.setBaseSalary(baseSalary);
		this.expYears= expYears;
		// TODO Auto-generated constructor stub
	}

	public int getExpYears() {
		return expYears;
	}

	public void setExpYears(int expYears) {
		this.expYears = expYears;
	}


	public double calculateFinalSalary(double baseSalary,double expYears) {
		double finalSalary = 0;
		double tmpExpHrs =  (baseSalary * 0.10) * expYears;
		finalSalary = baseSalary + tmpExpHrs;
		return finalSalary;
	}

	
	public static FulltimeTeacher findByFtId(List<FulltimeTeacher> ftList,int id) {

		for(FulltimeTeacher ft : ftList) {
			if(ft.getId() == id) {
				return ft;
			}

		}return null;

	}
	@Override
	public String toString() {
		return "---------------"+'\n'+"Fulltime Teacher name: " + getName() +'\n' + "Id: " + getId() +'\n'  + "Age: "
				+ getAge()+'\n'  + "Base Salary: " + getBaseSalary()+'\n' 
				+ "Experience Years: " + getExpYears() +'\n'  
				+ "Final Salary: " +calculateFinalSalary(getBaseSalary(), getExpYears()) ;
	}


	
	



}
