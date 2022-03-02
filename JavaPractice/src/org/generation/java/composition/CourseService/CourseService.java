package org.generation.java.composition.CourseService;
import java.util.HashMap;
import java.util.Map;
import java.util.List;




import java.util.Map;
import java.util.HashMap;

public class CourseService {

	private Map<String, Student> students;
	private Map<String, Course> courses;


// constructor

	public CourseService() {

		Course course1 = new Course("Java", "Java1", 5);
		Course course2 = new Course("CSS", "CSS1", 3);
		Course course3 = new Course("HTML", "HTML1", 3);

		this.courses = new HashMap<>();
		this.courses.put(course1.getId(), course1);
		this.courses.put(course2.getId(), course2);
		this.courses.put(course3.getId(), course3);


		Student student1 = new Student("Marcel", "1111");
		Student student2 = new Student("John", "1112");
		Student student3 = new Student("Jenny", "1113");

		this.students = new HashMap<>();
		this.students.put(student1.getId(), student1);
		this.students.put(student2.getId(), student2);

	} // end of constructor

	public void addCourse (String name, String id,int credit){

		// Create a new Instance object of the Course
		Course newCourse = new Course(name, id, credit);
		// Add new instance object to course Hashmap
		this.courses.put(newCourse.getId(), newCourse);
	}


	public Map<String,Course> getCourses(){
		return this.courses;
	}
	public Course findCourse (String id){
		// To be able to return a course with the courseID passed in as a parameter
		// id = "rabbit search in course hashmap
		// id = " CSS1 "
		//1) Access your course HashMap, know how to check if the id passed in as the
		// parameter is one of the key in your HashMap - HashMap methods
		// containKey() - return boolean (true or false)
		if(this.courses.containsKey(id))
		{ // return that one course subject with java1 as the key
			return this.courses.get(id);
		}
		return null;  //default
	}

//	public Student findStudent (String Id){
//		// To be able to return a course with the ID passed in as a parameter
//		// id = "rabbit search in student hashmap
//
//
//		return null;
//	}

	// use case is I want to know how many courses and the details of the course student is enrolled in
	public void enrollStudent(String studentId,String courseId){
	// To enroll student to the course with the studentId and courseId passed in as parameter
		// Your student's enrolledCourses list will have the course object
		// 111, Javascript1 passed as parameter
		// 1) Find and retrieve the student object from the HashMap with id 111

		// This student Id is 111 and name is Marcel
		// i can use this student object to call any method in the Student Class
		Student student = this.students.get(studentId);

		// a method in the student class to enroll the course to the student
		// add the course to the ArrayList in the student Class
		Course course = this.courses.get(courseId);
		student.enroll(course);  // pass the whole course object to the student class

		// handle if student object or course object is a null

	}

	public void unenrollStudent(String studentId, String courseId){
		Student student = this.students.get(studentId);
		Course course = this.courses.get(courseId);
		student.unEnroll(course);
	}

	public Student displayStudentInfo(String studentId) {
		// return the studen info (object) with the student ID passed in as the parameter
		//student hashMap
		return this.students.get(studentId);
	}

	public int totalEnrolledCourses(String studentId){
		Student student = this.students.get(studentId);
		return student.totalEnrollmentCourses();
//		return 0;
	}
	public int totalCredits(String studentId){
		int credit = 0;
		Student student = this.students.get(studentId);
		List<Course> courses = student.getEnrolledCourses();
		for (Course course : courses) {
			credit += course.getCredits();
		}
		return credit;

	}

//	public int totalCredits(String studentId){
//		int credit = 0;
//		Student student = this.students.get(studentId);
//		for (Course course : student.getEnrolledCourses()) {
//			credit += course.getCredits();
//		}
//		return credit;
//
//	}

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

	}  // end of toString



} // end of class
