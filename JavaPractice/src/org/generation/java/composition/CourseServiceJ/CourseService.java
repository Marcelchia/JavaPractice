package org.generation.java.composition.CourseServiceJ;

import java.util.Map;
import java.util.HashMap;

public class CourseService {

	private Map<String, Student> students;  //key (id) , value (Student object)
	private Map<String, Course> courses;    //key (id), value (Course object)

	//Constructor
	public CourseService() {

		//Information should be retrieved from the database - cover in SpringBoot

		//Create 3 course instance objects
		Course courseJava = new Course("Introduction to Java","java1", 5);
		Course courseCSS = new Course("Introduction to CSS","css1", 3);
		Course courseHTML = new Course("Introduction to HTML","html1", 3);

		//Key=id Value=Course object
		this.courses = new HashMap<>();
		//getter method to retrieve the course id
		this.courses.put(courseJava.getId(), courseJava);
		this.courses.put(courseCSS.getId(), courseCSS);
		this.courses.put(courseHTML.getId(), courseHTML);


		Student student1 = new Student("Jean Looi", "111");
		Student student2 = new Student("Bryan Chew", "222");

		this.students = new HashMap<>();
		this.students.put(student1.getId(), student1);
		this.students.put(student2.getId(), student2);
	}

	public void addCourse(String name,String id, int credit)
	{
		//TODO - To add new courses to the courses HashMap
		//1) Create a new instance object of the Course
		//2) Add the new instance object to the courses HashMap

		Course newCourse = new Course(name, id, credit);
		this.courses.put(newCourse.getId(), newCourse); //key,value

	}

	public Map<String, Course> getCourse() { return this.courses; }

	public Course findCourse(String id) {

		//TODO - To be able to return a course with the courseid passed in as the
		// parameter

		//id = "java1"
		//1) Access your courses HashMap, know how to check if the id passed in as the
		// paramater is one of the key in your HashMap - HashMap methodssss

		//containsKey() - return boolean (true or false)
		if (this.courses.containsKey(id))
		{
			//return that one course object with java1 as the key
			return this.courses.get(id);
		}

		return null;
	}

    /*public Student findStudent(String id) {

        //id = "rabbit" search in student hashmap

        return null;
    }*/

	//Use case is I want to know how many courses and the details of the courses that
	// this student is enrolled in
	public void enrollStudent(String studentId, String courseId)
	{
		//TODO T0 enroll student to the course with the studentId and courseId passed
		// in as the parameters
		//Your student's enrolledCourses list will have the course object

		// 111, java1 passed in as parameters
		//1) Find and retrieve the student object from the HashMap with id 111

		//This student Id is 111, name is Jean Looi
		//I can use this student object to call any method in the Student Class
		Student student = this.students.get(studentId);

		//call a method in the Student Class to enroll the course to the student (add
		// the course to the ArrayList in the Student Class

		Course course = this.courses.get(courseId);
		student.enroll(course); //pass the whole course object to enroll method

		//handle if student object or course object is a null

	}

	public void unEnrollStudent(String studentId, String courseId)
	{
		//TODO To unenroll student from the course with the studentId and courseId passed
		//in as the parameters
		Student student = this.students.get( studentId );
		Course course = this.courses.get( courseId );
		student.unEnroll( course );
	}

	public Student displayStudentInformation(String studentId) {

		//TODO - Return the student information (object) with the studentID passed in
		// as the parameter

		//students HashMap
		return this.students.get(studentId);
	}

	public int totalEnrolledCourses(String studentId) {
		//TODO - return the number of enrolled Courses of the student from the studentId
		Student student = this.students.get( studentId );
		return student.totalEnrollmentCourses();
	}

	public int totalCredit(String studentId)
	{
		//TODO - return the total number of credit(s) of the student from the studentId
		int totalCredit = 0;
		Student student = this.students.get( studentId );

		for (int i = 0; i < student.totalEnrollmentCourses(); i++) {
			totalCredit += student.getEnrolledCourses().get(i).getCredit();
		}
		return totalCredit;
	}

	@Override
	public String toString() {

		String courseTitle = "Courses offered from Jean's learning center: \n";
		String studentTitle = "Students registered to Jean's learning center: \n";

		String printCourses = "";
		String printStudents = "";

		for (Course c: this.courses.values())
		{
			printCourses += c + "\n";
		}

		for (Student s: this.students.values())
		{
			printStudents += s + "\n";
		}
		return courseTitle + printCourses + studentTitle + printStudents;
	}

} //End of CourseService Class