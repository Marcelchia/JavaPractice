package org.generation.java.composition.CourseService;

public class Course {
	private String name ;
	private String id ;
	private int credits ;


	//Constructor
	public Course(String name, String id, int credits)
	{
		this.name = name;
		this.id = id;
		this.credits = credits;
	}


	public String getName() {
		return name;
	}
	public void setName(String name){
		this.name = name;
	}

	public String getId() {
		return id;
	}
	public void setID(String id){
		this.id = id;
	}

	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits){
		this.credits = credits;
	}

	@Override
	public String toString(){
			return String.format("Course name is %s,id is %s and credits is %d ",this.name,this.id,this.credits);
		}
	}


