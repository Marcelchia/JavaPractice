package org.generation.java.composition.Library;

public class Member {
	private String id;
	private String name;
	private int age;

	public Member(String id,String name,int age){
			this.id = id;
			this.name = name;
			this.age = age;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id=id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}

	//Override
	public String toString(){
		return String.format("Member's name is %s. age is %d ",this.name,this.age);
	}


} // end of class
