package org.generation.java.Collections;
import java.util.ArrayList;
import java.util.Arrays;



public class ArrayListPractice {
	public static void main(String[] args) {
		System.out.println("Marcel");
		/*
		normal Array
		 */
		int[] arr = new int[2];
		arr[0] = 1;
		arr[1] = 2;
//		arr[2] = 3; //out of bound
		System.out.println(arr[1]);

		ArrayList<Integer> arrL = new ArrayList<Integer>(2);

		//add element to arrayList
		arrL.add(1);
		arrL.add(2);
		arrL.add(3);
		arrL.add(4);
		System.out.println(arrL.get(1));
		System.out.println(arrL);
		System.out.println(Arrays.toString(arr));

		//EX 3
		//Array definition of type String
		ArrayList<String> cars = new ArrayList<String>();

		//Adding values to array
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		System.out.println(cars);

		//Displaying array size
		int size = cars.size();
		System.out.println("total cars available " + size);

		//Display car in position 2
		String secondCar = cars.get(1);
		System.out.println("second car is " + secondCar);

		// Remove car in position 2
		cars.remove(1);
		System.out.println(cars);

		// for loop to iterate over car array
		for (String car : cars) {
			System.out.println("car : " + car);
		}
		System.out.println("=======");

		//EX 4

		int[] nums = new int[5];
		nums[0] = 5;
		nums[1] = 10;
		nums[2] = 15;
		nums[3] = 20;
		nums[4] = 25;
		//for loop
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (i + 1) * 5;
			System.out.println(nums[i]);
		}
//		System.out.println(Integer.toString(nums));
		//remove any number from the array

//		int[] newArr = new int[arr.length-1];
//		int removeNum = 20;
//		for(int j=0,k=0,j<arr.length;j++)
//		{
//			if (arr[j] != removeNum)
//			{
//				newArr[k] = arr[j]
//					k++
//			}
//		}


		System.out.println(nums);
		System.out.println("=======");
		//for each
		for (int num : nums) {
			System.out.println("num : " + num);
		}
		System.out.println("=======");
		for (int num : nums) {
			if (num == 5) {
				continue;
			}
			System.out.println("num : " + num);
		}

		//EX 5

		ArrayList<Integer> nums2 = new ArrayList<>();
		for (int i = 1; i < 11; i++) {
			nums2.add(i);
		}
		System.out.println(nums2);
		System.out.println("=============");
		for (int num : nums2) {
			if (num == 5) {
				continue;
			}
			System.out.println("num : " + num);
		}


		//ArrayList can contain duplicate values. ArrayList depends on the index of the element for removal,editing
		//etc eg: get() method and pass in the index

		ArrayList<Character> myChar = new ArrayList<>();
		myChar.add('A');
		myChar.add('B');
		myChar.add('C');
		myChar.add('D');
		System.out.println(myChar);

		char c = myChar.get(1);
		//passing index 1 as an argument to the get()
		//method provided by ArrayList Class

		//Calling the get() method and index 1 will passed in as the parameter of
		//get() method
		//get(Object o) {
		//block of codes
	//}
		System.out.println(c);















	}  // end of public static
}  // end of class
