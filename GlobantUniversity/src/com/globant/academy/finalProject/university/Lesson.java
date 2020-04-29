package com.globant.academy.finalProject.university;

import java.util.List;

import com.globant.academy.finalProject.persons.Student;
import com.globant.academy.finalProject.persons.Teacher;

public class Lesson {
	private String lessonName;
	private int lessonId;
	private int classroomId;
	private List <Student> studentsList;
	private Teacher teacherName;

	public Lesson(String lessonName,int lessonId, int classroomId, List<Student> studentsList, Teacher teacherName) {
		//		super();
		this.lessonName = lessonName;
		this.lessonId = lessonId;
		this.classroomId = classroomId;
		this.studentsList = studentsList;
		this.teacherName = teacherName;
	}
	public String getLessonName() {
		return lessonName;
	}
	public void setLessonName(String lessonName) {
		this.lessonName = lessonName;
	}
	public int getLessonId() {
		return lessonId;
	}
	public void setLessonId(int lessonId) {
		this.lessonId = lessonId;
	}
	public int getClassroomId() {
		return classroomId;
	}
	public void setClassroomId(int classroomId) {
		this.classroomId = classroomId;
	}
	public List<Student> getStudentsList() {
		return studentsList;
	}
	public void setStudentsList(List<Student> studentsList) {
		this.studentsList = studentsList;
	}
	public Teacher getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(Teacher teacherName) {
		this.teacherName = teacherName;
	}

	@Override
	public String toString() {
		return "Lesson [Lesson name:" + getLessonName() +"||"+ "Lesson Id: " + getLessonId()+"||" + "Clasroom Id: "
				+ getClassroomId() +'\n' +"Students List: " + getStudentsList() +'\n' +"Teachers List: "
				+ getTeacherName() + "]";
	}
	



}
