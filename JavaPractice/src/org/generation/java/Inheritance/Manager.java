package org.generation.java.Inheritance;
// child of employee
//this child will inherit the attributes and methods from the parent class
// Child can have its own set of attributes and methods
public class Manager extends Employee {

	private int _roleLevel;
	private String _roleDescription;

	//constructor
	// To create instance object of Manager, because of inheritance, need to take in
	// parents attribute as well.
	public Manager(int id,String name, double salary, int roleLevel, String roleDescription)
	{
		// int id,String name, double salary - attributes from parent , employee
		// cannot this._id = id
		// need to call the parent's constructor to assign the attribute values of
		// id,name,salary...constructor chaining, super

		// properties
		super(id,name,salary);   //parent
		this._roleLevel = roleLevel;
		this._roleDescription = roleDescription;
	}
	//getter and setter
	public int getRoleLevel() {
		return _roleLevel;
	}
	public void setRoleLevel(int roleLevel){
		this._roleLevel = roleLevel;
	}

	public String getRoleDescription() {
		return _roleDescription;
	}
	public void setRoleDescription(String roleDescription){
		this._roleDescription = roleDescription;
	}

	/// method overriding -override the method from the employee class
	@Override
	public String getName(){
		return "Hello Mr" + super.getName();
	}


	@Override
	public String toString(){
		// get from parent toString
		return super.toString() +
			String.format(" Manager Role Level:%d, Role Description: %s .",this._roleLevel,this._roleDescription);
	}

} // end of class
