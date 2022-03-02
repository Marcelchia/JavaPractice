package org.generation.java.composition.CourseService;



import org.generation.java.composition.Library.Book;

import java.util.List;
import java.util.Map;

// main Class is an example of an external Class/System
//Composition class - entry point will only be from CourseService class
//external Class/System cannot directly access the Course class or Student class

public class Main {
	public static void main(String[] args) {


		//1)  create an instance of courseCenter
		System.out.println("1");
		CourseService courseService = new CourseService();
		System.out.println(courseService);  // Overriding toString method
		System.out.println("Courses Offered : ");

		// courseService.getCourses(), returns hashmap of all the courses.
		System.out.println(courseService.getCourses());
		//For loop
//		for(Course c:courseService.getCourses().values())
//		{
//			System.out.println(c);   // ToString() method from the object class
//		}

		//2)add new course
		System.out.println("2");
		courseService.addCourse("Database","database1",8);
		courseService.addCourse("ReactJS","react1",5);
		System.out.println(courseService);  // Overriding toString method

//		for(Course c:courseService.getCourses().values())
//		{
//			System.out.println(c);   // ToString() method from the object class
//		}
//		Course course = New Course()


		//3) find a course
		System.out.println("3");

		Course findCourse = courseService.findCourse("Javascript1");
		if(findCourse !=null)
		{
			System.out.println("Course found ! \n " + findCourse);
		}
		else {
			System.out.println("Course not found ! Please try again " );
		}
		System.out.println("==============");

		// 4) enroll student to a course
		System.out.println("4");
		courseService.enrollStudent("1111","Java1");
		courseService.enrollStudent("1111","CSS1");
		System.out.println(courseService);
		System.out.println("==============");

		//5) Unenroll student from a course
		System.out.println("5");

		courseService.unenrollStudent("1111","Java1");
		System.out.println(courseService);

		//6) display a particular student info
		System.out.println("6");

		// return student details of ID 111
		Student getStudent = courseService.displayStudentInfo("1111");
		if(getStudent !=null){
			System.out.println("Student found ! \n " + getStudent);
		}else{
			System.out.println("Student not found ! Please try again " );
		}
		//7)display total course that a particular student is enrolled in
		System.out.println("7");
		int noOfCourseForStudent = courseService.totalEnrolledCourses("1111");
		System.out.println("No of course enrolled is " + noOfCourseForStudent );

//		System.out.println(courseService);

		//8)display the total number of credits that the particular student has
		System.out.println("8");
		System.out.println(courseService);
//		Student studentTarget = Student.getEnrolledCourses("1111");
		int creditsTotal = courseService.totalCredits("1111");
		System.out.println("Total no. of credits is " + creditsTotal);



//		System.out.println(studentTarget);











	} // end of void

} // end of class
