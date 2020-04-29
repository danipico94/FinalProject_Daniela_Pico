package com.globant.academy.finalProject.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.naming.PartialResultException;

import com.globant.academy.finalProject.persons.FulltimeTeacher;
import com.globant.academy.finalProject.persons.ParttimeTeacher;
import com.globant.academy.finalProject.persons.Student;
import com.globant.academy.finalProject.persons.Teacher;
import com.globant.academy.finalProject.university.Classroom;
import com.globant.academy.finalProject.university.Lesson;
import com.globant.academy.finalProject.university.University;


public class Enrollment {

	static University globUni = new University ();
	

	public static void main(String[] args) {
		int op = 0;
		Scanner scan = new Scanner(System.in);

		while(op != 7) {

			System.out.println("********************************************");
			System.out.println("********Welcome to Globant University*******");
			System.out.println("Enter the type of transaction you want to make:");
			System.out.println("1.List the of the teachers avaible and it's related information");
			System.out.println("2.List of the avaiable Lessons");
			System.out.println("3.Create a new Student");
			System.out.println("4.List of avaiable students");
			System.out.println("5.Add a new Lesson");
			System.out.println("6.Find all the lessons for an student");
			System.out.println("7.Exit");
			System.out.println("********************************************");

			op = scan.nextInt(); 


			switch(op) {
			case 1:
				System.out.println("********************************************");
				System.out.println("List of Part Time Teachers");
				globUni.getParttimeTeachersList().forEach(parttimeTeacher -> System.out.println(parttimeTeacher.toString()));
				System.out.println("********************************************");
				System.out.println("List of Full Time Teachers");
				globUni.getFulltimeTeachersList().forEach(fulltimeTeacher -> System.out.println(fulltimeTeacher.toString()));
				System.out.println("List of classroom");
				break;
			case 2:
				int op1 = 0;
				Scanner scan2 = new Scanner(System.in);
				System.out.println("********************************************");
				System.out.println("List of avaiable lessons:");
				System.out.println("Lesson Id || Lesson Name");
				globUni.getLessonsList().forEach(lesson -> System.out.println(lesson.getLessonId()+" || "+lesson.getLessonName()));
				while(op1 != 2) {
					System.out.println("*************************************************");	
					System.out.println("*Welcome to Globant University Lessons Management*");
					System.out.println("Enter the type of transaction you want to make:");
					System.out.println("1. Print the data of a specific lesson");
					System.out.println("2. Go to main menu");
					op1 = scan.nextInt(); 

					switch(op1) {
					case 1:
						System.out.println("Enter the Id of the lesson for more information:");
						int searchCode = scan2.nextInt();
						for (Lesson lesson : globUni.getLessonsList()) {
							if (lesson.getLessonId() == searchCode) {
								System.out.println("Lesson Name || Lesson Id || Classroom Id");
								System.out.println(lesson.toString());
							} else {
								System.out.println("The lesson doesn't exist");
							}

						} 
					}
				}break;

			case 3:
				System.out.println("Enter the name of the new student:");
				String nameStudent = scan.next();
				System.out.println("Enter the id of the new student:");
				int idStudent = scan.nextInt();
				System.out.println("Enter the age of the new student:");
				int ageStudent = scan.nextInt();
				if(findByStId(globUni.getStudentsList(), idStudent)==null) {
					Student student2 = new Student(nameStudent, idStudent, ageStudent);
					globUni.getStudentsList().add(student2);
					System.out.println("Enter the lesson id in orden to add the student");
					System.out.println("Lesson Id || Lesson Name");
					globUni.getLessonsList().forEach(lesson -> System.out.println(lesson.getLessonId()+" || "+lesson.getLessonName()));
					int idLesson = scan.nextInt();
					globUni.getLessonsList().forEach(lesson -> lesson.getLessonId());
					for (Lesson lesson : globUni.getLessonsList()) {
						if (lesson.getLessonId() == idLesson) {
							lesson.getStudentsList().add(student2);
							//							System.out.println(lesson.getLessonId()+" "+idLesson);
							System.out.println("Student " +nameStudent+" Correctly added to lesson: "+lesson.getLessonName());
						} else {
							System.out.println("The lesson doesn't exist");
						}
					}

				} else {
					System.out.println("The student already exists");
				}



				break;
			case 4:
				System.out.println("List of avaiable Students");
				globUni.getStudentsList().forEach(student -> System.out.println(student.toString()));
				break;
			case 5:
				System.out.println("********************************************");
				System.out.println("Enter the name of the new lesson:");
				String lessonName = scan.next();
				System.out.println("Enter the id of the new lesson:");
				int lessonId = scan.nextInt();
				System.out.println("Select the classroom Id");
				System.out.println("********************************************");
				System.out.println("List of classrooms");
				globUni.getClassroomsList().forEach(classroom -> System.out.println(classroom.toString()));
				int classroomId = scan.nextInt();
				List<Student> tmpStudentsList = new ArrayList<>();
				List <Student> lclStudents = globUni.getStudentsList();
				if (findByLessonId(globUni.getLessonsList(), lessonId) == null) {
					if(findByClroomId(globUni.getClassroomsList(), classroomId) != null) {
						System.out.println("How many students do you want to add");
						int n = scan.nextInt();
						System.out.println("Select the student that you want to add");
						System.out.println("List of Students");
						System.out.println("Student Id || Student Name");
						globUni.getStudentsList().forEach(student -> System.out.println(student.getId()+" || "+student.getName()));

						for (int i=0; i<n ; i++) {
							System.out.println("Type the id of the student");
							int idAddStudent = scan.nextInt();
							if(findByStId(lclStudents, idAddStudent) != null) {
								String tmpName = findByStId(lclStudents, idAddStudent).getName();
								int tmpAge = findByStId(lclStudents, idAddStudent).getAge();
								Student tmpStudent = new Student(tmpName, idAddStudent, tmpAge);
								tmpStudentsList.add(tmpStudent);
							}

						}
						int op2 = 0;
						Scanner scan3 = new Scanner(System.in);

						System.out.println("********************************************");
						System.out.println("Select the type of teacher");
						System.out.println("1.Part time teachers");
						System.out.println("2.Full time teachers");
						op2 = scan3.nextInt();


						if (op2 == 1) {
							System.out.println("Enter the id of the teacher in order to asign it to the class");
							System.out.println("List of Part Time Teachers");
							globUni.getParttimeTeachersList().forEach(parttimeTeacher -> System.out.println(parttimeTeacher.getId()+" || "+parttimeTeacher.getName()));
							int ptId = scan3.nextInt();
							if(findByPtId(globUni.getParttimeTeachersList(), ptId) != null) {
								Lesson lsPt = new Lesson(lessonName, lessonId, classroomId, tmpStudentsList, findByPtId(globUni.getParttimeTeachersList(), ptId));
								globUni.getLessonsList().add(lsPt);
								System.out.println("The lesson:" +lessonName+" With the students"+'\n'+tmpStudentsList+" Was correctly created");

							}
						}
						else if (op2 == 2) {
							System.out.println("List of Full Time Teachers");
							globUni.getFulltimeTeachersList().forEach(fulltimeTeacher -> System.out.println(fulltimeTeacher.getId()+" || "+fulltimeTeacher.getName()));
							int ftId = scan3.nextInt();
							if(findByFtId(globUni.getFulltimeTeachersList(), ftId) != null) {
								Lesson lsFt = new Lesson(lessonName, lessonId, classroomId, tmpStudentsList, findByFtId(globUni.getFulltimeTeachersList(), ftId));
								globUni.getLessonsList().add(lsFt);
								System.out.println("The lesson:" +lessonName+" With the students"+'\n'+tmpStudentsList+" Was correctly created");

							}
						} else {
							System.out.println("Enter a valid number");
						}


					}
				} else {
					System.out.println("The lesson already exist");
				}
				break;

			case 6:
				System.out.println("List of Students");
				System.out.println("Student Id || Student Name");
				globUni.getStudentsList().forEach(student -> System.out.println(student.getId()+" || "+student.getName()));
				System.out.println("Type the id of the student");
				int idSearchStudent = scan.nextInt();
				for (Lesson lesson : globUni.getLessonsList()) {
					if (findByStId(lesson.getStudentsList(), idSearchStudent) != null) {
						System.out.println("The student is in lesson -->" +" " +lesson.getLessonName());
					} 

				}
				break;

			}



		}

	}
	
	public static Student findByStId(List<Student> stList,int id) {

		for(Student s : stList) {
			if(s.getId() == id) {
				return s;
			}

		}return null;

	}

	public static Lesson findByLessonId(List<Lesson> lsList,int id) {

		for(Lesson ls : lsList) {
			if(ls.getLessonId() == id) {
				return ls;
			}

		}return null;

	}
	public static Classroom findByClroomId(List<Classroom> clList,int id) {

		for(Classroom cr : clList) {
			if(cr.getClassroomId() == id) {
				return cr;
			}

		}return null;

	}

	public static ParttimeTeacher findByPtId(List<ParttimeTeacher> ptList,int id) {

		for(ParttimeTeacher pt : ptList) {
			if(pt.getId() == id) {
				return pt;
			}

		}return null;

	}

	public static FulltimeTeacher findByFtId(List<FulltimeTeacher> ftList,int id) {

		for(FulltimeTeacher ft : ftList) {
			if(ft.getId() == id) {
				return ft;
			}

		}return null;

	}


}
