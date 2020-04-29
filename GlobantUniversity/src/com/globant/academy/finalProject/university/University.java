package com.globant.academy.finalProject.university;

import java.util.List;

import com.globant.academy.finalProject.persons.FulltimeTeacher;
import com.globant.academy.finalProject.persons.ParttimeTeacher;
import com.globant.academy.finalProject.persons.Student;
import static com.globant.academy.finalProject.utils.InitData.*;

public class University {

	private List <Student> studentsList;
	private List <ParttimeTeacher> parttimeTeachersList;
	private List <FulltimeTeacher> fulltimeTeachersList;
	private List <Lesson> lessonsList;
	private List <Classroom> classroomsList;

	public University() {
		this.studentsList = initStudents();
		this.parttimeTeachersList = initParttimeTeachers();
		this.fulltimeTeachersList = initFulltimeTeachers();
		this.classroomsList = initClassrooms();
		this.lessonsList = initLessons();
	}

	public List <Student> getStudentsList() {
		return studentsList;
	}

	public void setStudentsList(List <Student> studentsList) {
		this.studentsList = studentsList;
	}

	public List<ParttimeTeacher> getParttimeTeachersList() {
		return parttimeTeachersList;
	}

	public void setParttimeTeachersList(List<ParttimeTeacher> parttimeTeachersList) {
		this.parttimeTeachersList = parttimeTeachersList;
	}

	public List<FulltimeTeacher> getFulltimeTeachersList() {
		return fulltimeTeachersList;
	}

	public void setFulltimeTeachersList(List<FulltimeTeacher> fulltimeTeachersList) {
		this.fulltimeTeachersList = fulltimeTeachersList;
	}

	public List<Lesson> getLessonsList() {
		return lessonsList;
	}

	public void setLessonsList(List<Lesson> lessonsList) {
		this.lessonsList = lessonsList;
	}

	public List<Classroom> getClassroomsList() {
		return classroomsList;
	}

	public void setClassroomsList(List<Classroom> classroomsList) {
		this.classroomsList = classroomsList;
	}

}
