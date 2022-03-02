package org.generation.java.Polymorphism.AbstractClass;

public class Main {

		public static void main(String[] args) {

			//create instance of Rectangle, Circle
			// Rectangle rect = new Rectangle(5,7) // works but not recommended
			Shape rect = new Rectangle(5, 7);
			System.out.println(rect);

			Shape triangle = new Triangle(10, 14,20);
			System.out.println(triangle);

			Shape circle = new Circle(5);
			System.out.println(circle);


			//List<Course> enrolled
			//List course = new ArrayList<>()
			//List course = new LinkedList<>()
			//Both ArrayList<>() and LinkedList<>() will have add(), remove(), clear()......




	} // end of void
} // end of class
