
package org.generation.java.ExceptionalHandling;
public class Main {
	public static void main(String[] args) {

//
//		int aa = 5;
//		int bb = 0;
//		int cc = aa/bb;
//		System.out.println(cc);

		Calculator calculator = new Calculator();

		try {
			int sum = calculator.multiply(2, 3);
			System.out.println("multiple: " + sum);
			System.out.println("divide : " + calculator.divide(10, 2));
			System.out.println("divide : " + calculator.divide(0, 5));
			System.out.println("divide : " + calculator.divide2(5, 0));

			//System.out.println("add : " + calculator.add(5, 5));
			//System.out.println("subtract : " + calculator.subtract(20, 5));
		}
		catch (ArithmeticException e)
			// e is an object from the ArithmeticException Class e.getMessage() is a
			//method provided by Exception Class
		{
			System.out.println(e.getMessage());
		}
		catch (NumberFormatException e)
		{
			System.out.println(e.getMessage());
		}
		catch (Exception e)
		{
			System.out.println("Other Error Occur");
		}
		finally
		{
			// will be executed regardless if there is an exception or not
			// Cleaning up - close database connection
			System.out.println("add : " + calculator.add(5, 5));
			System.out.println("subtract : " + calculator.subtract(20, 5));
		}


		try {
			int[] arr = {1,2,3};
			System.out.println(arr[10]);
		}
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Array our of bound");
		}

		// Class that opens a file
		// Open a file - but the file might be removed already - FileNotFoundException

		/*
		try {

		}
		catch (FileNotFoundException e)
		{


		}
		 */
	}
}
