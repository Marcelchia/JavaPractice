package org.generation.java.Collections;
import java.util.HashMap;

public class HashMapEx {
	public static void main(String[] args) {

		// Hashmap definition
		HashMap<Integer,String> users = new HashMap<Integer, String>();

		//Adding value to map
		users.put(1,"Camilo");
		users.put(2,"Andres");
		users.put(3,"Laura");
		users.put(4,"Andres");
		users.put(5,"Kate");
		System.out.println(users);

		//displaying map size
		int size = users.size();
		System.out.println("total users: " + size);

		// Display user with key 2
		String userKey2 = users.get(2);
		System.out.println("User with Key 2 " + userKey2);

		// Remove value with key 2
		users.remove(2);
		System.out.println(users);

		//Use for loop
		for(int key: users.keySet()){
			System.out.println("key : " + key + " value : " + users.get(key));
		}

		// Ex 4
		HashMap<Integer,String> dataType = new HashMap<Integer, String>();

		dataType.put(1,"int");
		dataType.put(2,"boolean");
		dataType.put(3,"double");
		dataType.put(4,"string");
		dataType.put(5,"float");
		System.out.println(dataType);


		for(int key: dataType.keySet()){
			System.out.println("key : " + key + " value : " + dataType.get(key));
		}

		dataType.remove(5);
		System.out.println(dataType);



	} // void
} // class
