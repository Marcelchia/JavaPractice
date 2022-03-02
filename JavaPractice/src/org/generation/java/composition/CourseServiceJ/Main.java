package org.generation.java.composition.CourseServiceJ;

public class Main {

	public static void main(String[] args) {

		//Create an instance object of CourseService
		CourseService courseService = new CourseService();

		System.out.println(courseService);      //Overridding toString() method

        /*
        System.out.println("Courses offered from Jean's learning center: ");
        //courseService.getCourse() - return HashMap of the courses (this.courses)
        for (Course c: courseService.getCourse().values())
        {
            System.out.println(c);
            //what is c - refer to individual Course object from the this.courses HashMap
            //System.out.println - print out whatever String that is return from the
            // toString() method from that Object Class (Course object class)
        }
         */

		//add 2 new courses my learning center
        /*
        new course : name=introduction to database, id=database1, credit=8
        new course : name=introduction to ReactJS, id=react1, credit=5
         */
		courseService.addCourse("Introduction to database", "database1", 8);
		courseService.addCourse("Introduction to ReactJS", "react1", 5);

		System.out.println(courseService);

        /*
        System.out.println("Courses offered from Jean's learning center: ");

        for (Course c: courseService.getCourse().values())
        {
            System.out.println(c);
        }

         */


		//find a course
		//Main Class is an example of an external Class/System
		//Composition class - entry point will only be from CourseService class
		//external Class/System cannot directly access the Course class or Student class
		Course findCourse = courseService.findCourse("css1");

		if (findCourse != null)
		{
			System.out.println("Course Found! \n" + findCourse);
		}
		else
		{
			System.out.println("Course not found. Please try again");
		}


		//enroll student to a course - student id = 111, course id = java1
		//Student student = new Student("aaa", "112");
		//student.enroll("java1");
		courseService.enrollStudent("111", "java1");
		courseService.enrollStudent("111", "css1");

		System.out.println(courseService);

		//Unenroll student from a course

		//display a particular student information with the studentId
		//return Student details with ID of 111
		Student getStudent = courseService.displayStudentInformation("112");

		if (getStudent != null) {
			System.out.println("Student Found! \n" + getStudent);
		}
		else
		{
			System.out.println("Student not found, please try again");
		}

		//display the total courses that a particular student is enrolled in
		System.out.println(courseService.displayStudentInformation("111"));

		//display the total number of credits that the particular student has
		int totalCredits = courseService.totalCredit("111");
		System.out.println(String.format("Total course credits : " +
			"course: %d", totalCredits));
	}

}
