package org.generation.java.Polymorphism.AbstractClass;


	public class Triangle extends Shape {
		private final double a, b, c; // sides

		public Triangle(double a, double b, double c) {
			this.a = a;
			this.b = b;
			this.c = c;
		}

		@Override
		public double area() {
			// Heron's formula:
			// A = SquareRoot(s * (s - a) * (s - b) * (s - c))
			// where s = (a + b + c) / 2, or 1/2 of the perimeter of the triangle
			double s = (a + b + c) / 2;
			return Math.sqrt(s * (s - a) * (s - b) * (s - c));
		}

		@Override
		public double perimeter() {
			// P = a + b + c
			return a + b + c;
		}

		@Override
		public String toString()
		{
			return String.format("A: %.2f, B: %.2f, C: %.2f ", a, b, c) + super.toString();
		}



} // end of class
