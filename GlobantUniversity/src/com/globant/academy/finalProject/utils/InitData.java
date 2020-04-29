package com.globant.academy.finalProject.utils;

import java.util.ArrayList;
import java.util.List;

import com.globant.academy.finalProject.persons.FulltimeTeacher;
import com.globant.academy.finalProject.persons.ParttimeTeacher;
import com.globant.academy.finalProject.persons.Student;
import com.globant.academy.finalProject.persons.Teacher;
import com.globant.academy.finalProject.university.Classroom;
import com.globant.academy.finalProject.university.Lesson;

public class InitData {

	private static Common com = new Common();

	public static List<Student> initStudents() {
		List<String> lines = com.readFile("students.txt");
		List<Student> studentsList = new ArrayList<>();

		for (String line : lines) {
			String[] values = line.split(",");

			Student student= new Student(values[0], Integer.parseInt(values[1]), Integer.parseInt(values[2]));
			studentsList.add(student);
		}
		return studentsList;
	}

	public static List<ParttimeTeacher> initParttimeTeachers() {
		List<String> lines = com.readFile("parttimeTeachers.txt");
		List<ParttimeTeacher> parttimeTeachersList = new ArrayList<>();

		for (String line : lines) {
			String[] values = line.split(",");

			ParttimeTeacher parttimeTeacher = new ParttimeTeacher(values[0], Integer.parseInt(values[1]), 
					Integer.parseInt(values[2]), Double.parseDouble(values[3]), Double.parseDouble(values[4]));
			parttimeTeachersList.add(parttimeTeacher);
		}
		return parttimeTeachersList;
	}

	public static List<FulltimeTeacher> initFulltimeTeachers() {
		List<String> lines = com.readFile("fulltimeTeachers.txt");
		List<FulltimeTeacher> fulltimeTeachersList = new ArrayList<>();

		for (String line : lines) {
			String[] values = line.split(",");

			FulltimeTeacher fulltimeTeacher = new FulltimeTeacher(values[0], Integer.parseInt(values[1]),
					Integer.parseInt(values[2]), Double.parseDouble(values[3]), Integer.parseInt(values[4]));
			fulltimeTeachersList.add(fulltimeTeacher);
		}
		return fulltimeTeachersList;
	}

	public static List<Classroom> initClassrooms() {
		List<String> lines = com.readFile("classrooms.txt");
		List<Classroom> classroomsList = new ArrayList<>();

		for (String line : lines) {
			String[] values = line.split(",");

			Classroom classroom = new Classroom(Integer.parseInt(values[0]), values[1]);
			classroomsList.add(classroom);
		}
		return classroomsList;
	}

	public static List<Lesson> initLessons() {
		List<Lesson> lessonsList = new ArrayList<>();
		
		Teacher tch1 = new ParttimeTeacher("Filomena", 65987, 36, 1500000, 50);

		Lesson lesson = new Lesson("Chemistry", 100 ,01, initStudents(),tch1);
		lessonsList.add(lesson);
		
		Teacher tch2 = new FulltimeTeacher("Ernesto", 587963, 52, 2600000, 20);
		

		Lesson lesson2 = new Lesson("Physics",101, 02, initStudents(),tch2);
		lessonsList.add(lesson2);


		return lessonsList;
	}

}
