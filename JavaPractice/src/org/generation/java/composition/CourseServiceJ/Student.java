package org.generation.java.composition.CourseServiceJ;

import java.util.List;
import java.util.ArrayList;

public class Student {

	private String name;
	private String id;

	private List<Course> enrolledCourses;

	//Student sign up for a learning academy - Codeademy, Udamy
	//There is a record of the student in the system - id, name, email etc
	//First thing is to show a list of courses on your dashboard, or search for course(s)
	//Initially student do not have any enrolled course(s)
	public Student(String name, String id) {
		this.name = name;
		this.id = id;

		//create an empty enrolledCourses List
		this.enrolledCourses = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void enroll(Course course) {
		//TODO - Be able to enroll the student to the course. - Add the course to the
		// enrolledCourses list

		//Have received the Course object with ID java1, i need to add the Course to
		// the enrolledCourses ArrayList
		this.enrolledCourses.add(course);

	}

	public void unEnroll(Course course) {
		//TODO - Be able to perform unenrollment of the course. - Remmove the course
		// from the enrolledCourses list
		this.enrolledCourses.remove(course);
	}

	public int totalEnrollmentCourses() {
		//TODO - TO return the total number of enrolledCourses of the student
		return this.enrolledCourses.size();
	}

	public List<Course> getEnrolledCourses() {
		//TODO - To return the list of enrolledCourses of the student
		return this.enrolledCourses;
	}

	@Override
	public String toString() {
		return String.format("Student Id: %s, Name: %s, Enrolled Courses: ", this.id,
			this.name) + this.enrolledCourses;
	}

}
