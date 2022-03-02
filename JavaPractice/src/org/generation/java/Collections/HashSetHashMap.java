package org.generation.java.Collections;
import java.util.HashSet;
import java.util.HashMap;

// every item in the array has to be unique

public class HashSetHashMap {
	public static void main(String[] args) {
		//Hashset - unique values in the collection
		HashSet<String> names = new HashSet<>();
		names.add("Tom");
		names.add("Heee");
		names.add("Jerry");
		names.add("Tom");

		System.out.println(names);  // Tom,Jerry,Hee
		System.out.println(names.size());  // 3

		//Check if Jerry assist in the HashSet
		System.out.println(names.contains("Jerry"));  //true, may use if else statement
		names.remove("Jerry"); // .clear remove all item
		System.out.println(names);


		//HashMap -Key,value pair - customer list (customer ID key Integer)
		//customer name as the value (String)
		//All the information can be retrieved from the database
		//customer id, name,age,address,mobile - to be retrieved from the database
		//stores in a Hashmap with customerID as the key, and name,age,address,
		//mobile as an object in the value.
		//Front end, there is earch for customer ID - key is the ID customer
		// 1)Everything do a SQL Query to keep query the database (every call of API takes money
		// 2) Retrieve part or/ all of your records from the database and store into HashMap.
		//Search within the hashmap - return the whole hashmap to the frontend .


		HashMap<Integer, String> customers = new HashMap<>();

		customers.put(1111,"Tom");
		customers.put(2222,"John");
		customers.put(3333,"Kate");
		customers.put(4444,"Kate");

		System.out.println(customers);
		System.out.println(customers.size());

		customers.put(3333,"Jean");  //value will replace for that key
		customers.put(1111,"Tom");  //No change to key and value since its similar

		System.out.println(customers.get(2222));

		customers.remove(3333);
		System.out.println(customers);

		System.out.println(customers.containsKey(1111));
		System.out.println(customers.containsValue("Tom123"));

		//containsKey(), containsValue()...........

		for(int key:customers.keySet()){
			System.out.println("Customer ID:" + key + " Customer Name " + customers);
		}




	}
}
