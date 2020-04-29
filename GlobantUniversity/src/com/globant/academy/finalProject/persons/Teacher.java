package com.globant.academy.finalProject.persons;

public class Teacher extends Person{
	private double baseSalary;

	public Teacher(String name, int id, int age) {
		super(name, id, age);
		// TODO Auto-generated constructor stub
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	@Override
	public String toString() {
		return "Teacher [baseSalary=" + baseSalary + ", getName()=" + getName() + ", getId()=" + getId() + ", getAge()="
				+ getAge() + "]";
	}

}
