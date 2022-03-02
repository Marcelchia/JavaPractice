package org.generation.java.composition.CourseService;
import java.util.List;
import java.util.ArrayList;

public class Student {


	private String name ;
	private String id ;
	private List<Course> enrolledCourses;

	// constructor
	public Student(String name, String id)

	{
		this.name= name;
		this.id=id;
		// create an empty array
		this.enrolledCourses = new ArrayList<>();


	} //end of constructor

	//Getter and Setter


	public String getName() {
		return name;
	}
	public void setName(String name){
		this.name = name;
	}

	public String getId() {
		return id;
	}
	public void setID(String id){
		this.id = id;
	}

	//methods


	public void enroll(Course course){
		// Be able to enroll student to the course - add course to enrolledCourse list
		//Have received the Course Object with ID java1, add the Course to the enrolledCourses ArrayLists
		this.enrolledCourses.add(course);

	}
	public void unEnroll(Course course){
		this.enrolledCourses.remove(course);
	}

	public int totalEnrollmentCourses(){

	return this.enrolledCourses.size();
//		return 0;
	}

	public int totalCredits(String studentId){
//
//		int sum = 0;
//		this.enrolledCourses.get(1).getCredits();
		//totalCredit method
//		int credit = 0;
//		Student student = this.students.get(studentId);
//		List<Course> courses = student.getEnrolledCourses();
//		for (Course course : courses) {
//			credit += course.getCredits();
//		}
		return 0;
		}


	public List <Course> getEnrolledCourses(){
		return this.enrolledCourses;
	}

	@Override
	public String toString(){
		return String.format("Student name is %s,id is %s ",this.name,this.id) + this.enrolledCourses;
	}











}  // end of class
