package org.generation.java.ExceptionalHandling;

public class Calculator {
	public Calculator() {}
	public int add(int a, int b) {return a + b;}
	public int subtract(int a, int b) {return a - b;}
	public int multiply(int a, int b) {
		return a * b;
	}
	// public double divide(int a, int b) {return a/b}
	// With Exceptional Handling

	public int divide(int a, int b) throws ArithmeticException {
		if (b == 0){
			throw new ArithmeticException("Unable to division by 0");
		} else{
			return a / b;
		}
	}

	// may have different methods that also requires to throw an
	// ArithmeticException with a different message

	public int divide2(int a, int b) throws ArithmeticException {
		if (b == 0){
//			This messsage will replace the orginal message provided by the ArithmeticException Class
			throw new ArithmeticException("Unable to division by 0 with interest");
		} else{
			return a / b * 2;
		}
	}
} // end of class


