package com.globant.academy.finalProject.university;

public class Classroom {

	private int classroomId;
	private String classroomName;

	public Classroom(int classroomId, String classroomName) {
		//		super();
		this.classroomId = classroomId;
		this.classroomName = classroomName;
	}

	public int getClassroomId() {
		return classroomId;
	}
	public void setClassroomId(int classroomId) {
		this.classroomId = classroomId;
	}
	public String getClassroomName() {
		return classroomName;
	}
	public void setClassroomName(String classroomName) {
		this.classroomName = classroomName;
	}

	@Override
	public String toString() {
		return "Classroom classroom Id:" + classroomId + ", classroom name: " + classroomName;
	}



}
