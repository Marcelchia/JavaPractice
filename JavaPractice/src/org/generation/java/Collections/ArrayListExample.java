package org.generation.java.Collections;
import java.util.Arrays;
import java.util.ArrayList;


// if you need to change class name , right click and refactor to rename
public class ArrayListExample {
	//shortcut type main tab
	public static void main(String[] args) {
		//storing multiple objects or values - 2 groups
		//1) Standard Array Object - built in from Java package(same as Javascript)
														//there are some restriction on Array object
		//2) Collections object - allow searching,sorting,insertion, manipulation and deletion

		// Primitive - int, char,byte,long float, double ....
		// Non Primitive Mulitple characters, Class


		String myname = "John";
		String[] names = {"Marcel","Marc","Jean","Tom"};
		int[] ages = {18,19,20,21};

		// can reassign value to individual element in the array
		names[1]="Tommy";
		System.out.println(names[1]);
		System.out.println(names.length);

		for(String name : names) {
			if(name.equals("Marcel")) {
				System.out.println(name);
			}
		}

/*
		System.out.println(Arrays.toString(names));
		names[4]="New name";  //Cannot increase the size of array
		System.out.println(names[4]); //throw an error: ArrayIndexOutOfBoundsException

		Array - Need to be fixed size when declaration of Array
		countryCode get database (country list, country code)
		65,60,61
 */


		int countryCodeNum = 3;
		//Create country code array with fixed size of 3 - it is a must to specify
		// the size of the array when creating the array
		int[] countryCode = new int[countryCodeNum];
		countryCode[0] = 65;
		countryCode[1] = 60;
		countryCode[2] = 61;

		//countryCode[3] = 55;   //Unable to add more element


		/*
		ArrayList - Non fixed size array, and elements can be added or removed from the array list.
		eg: Product items retrieve from the database store in a Collection.
		when admin add a new product item , able to add to the ArraysList

		 */

		//Type inference
		//String is an object
		//ArrayList is a class, have to make use of the method
		//ArrayList default is 10
		//ArrayList<String> myStudents = new ArrayList<String>();
		ArrayList<String> myStudents = new ArrayList<>(50);
		myStudents.add("Tom");
		myStudents.add("John");
		myStudents.add("Jenny");

		System.out.println(myStudents); //actually calling the toString() method from the ArrayList Class -Next week

		//myStudent[0];  will not work
		myStudents.get(1);
		myStudents.set(0,"Tommy");
		myStudents.remove(1);
		System.out.print(myStudents.size());  // .length for Array
		int StudentArrayList = myStudents.size();
		System.out.print(StudentArrayList);


		/*
		ArrayList is known as Generic Class, which works with different data types(object) such as String.
		if now i wanted to create ArrayList for int,char,float,double(primitive data type, not an object)
		therefore,we need to use wrapper class to convert primitive data type to an object
		 */

		//Cannot declare the ArrayList using primitive data type because ArrayList takes in object
		//ArrayList<int>myStudent = new ArrayList<int>();
		int a = 25;
		ArrayList<Integer> myItems = new ArrayList<>();
		// 25 and 50 passing in as primitive datatype, call the add method(), there is an
		//autoboxing process in the method to convert the primitive to an object
		myItems.add(a);
		myItems.add(60);
		myItems.add(50);
		System.out.println(myItems);

		ArrayList<Character>myChar = new ArrayList<>();
		myChar.add('A');  // char -primitive data type - autoboxing process
		myChar.add('B');
		myChar.add('C');


		char c = myChar.get(1);
		System.out.println(c);
		System.out.println(myChar);

		//get method() will perform unboxing - convert the object
		// to the corresponding primitive data type - return the item as char data type

	}
}


