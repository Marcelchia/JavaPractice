package org.generation.java.Collections;
import java.util.HashSet;
import java.text.DateFormatSymbols;

public class HashSetEx {

	public static void main(String[] args) {
		//Ex1
		// Hashset definition of type String
		HashSet<String> names = new HashSet<String>();

		//Adding values to set
		names.add("Santiago");
		names.add("Andres");
		names.add("Camilo");
		names.add("Santiago");

		System.out.println(names);

		//Displaying the set size
		int size = names.size();
		System.out.println("Total names: " + size);

		//Verify if set contains name Santiago
		boolean containName = names.contains("Santiago");
		System.out.println("containNames : " + containName);

		//Remove name : Santiago
		names.remove("Santiago");
		System.out.println(names);

		// Use for loop to iterate over array
		for(String name: names){
			System.out.println("name : "+ name);
		}

		//Ex2
		HashSet<String> months = new HashSet<String>();
		months.add("Jan");
		months.add("Feb");
		months.add("Mar");
		months.add("Apr");
		months.add("May");
		months.add("Jun");
		months.add("Jul");
		months.add("Aug");
		months.add("Sep");
		months.add("Oct");
		months.add("Nov");
		months.add("Dec");

		for(String month: months){
			System.out.println("name : "+ month);
		}

		months.remove("Dec");
		System.out.println("======");
		System.out.println(months);




		// Ex 2 Jean
		HashSet<String> monthSet = new HashSet<>();
		String[] monthsJ = new DateFormatSymbols().getMonths();  //ArrayList, HashSet etc
		// Standard array are good for elements that are fixed

		for ( int i=0; i<monthsJ.length-1; i++ )
		{
			monthSet.add(monthsJ[i]);
		}

		System.out.println(monthSet);
		monthSet.remove("January");
		System.out.println(monthSet);

	}  // end of void


}  // end of class
