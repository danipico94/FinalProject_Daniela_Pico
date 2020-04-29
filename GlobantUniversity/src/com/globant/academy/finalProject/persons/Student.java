package com.globant.academy.finalProject.persons;

import java.util.List;

public class Student extends Person{


	public Student(String name, int id, int age) {
		super(name, id, age);
	}


	@Override
	public String toString() {
		return "----------------------------------------"+
	'\n'+"Student name: " + getName() +" Id: " + getId()  +" Age: " + getAge() +'\n';
	}




}
