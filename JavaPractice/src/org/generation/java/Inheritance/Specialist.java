package org.generation.java.Inheritance;

public class Specialist extends Employee {

	//properties

	private char _roleTitle;
	private String _roleDescription;
	private String _specialisation;

	//constructor
	public Specialist(int id, String name, double salary, char roleTitle, String roleDescription, String specialisation) {

		super(id,name,salary);  //parent
		this._roleTitle = roleTitle;
		this._roleDescription = roleDescription;
		this._specialisation = specialisation;
	}
	// getter and setter
	public char getRoleTitle() {
		return _roleTitle;
	}
	public void setRoleTitle(char roleTitle){
		this._roleTitle = roleTitle;
	}

	public String getRoleDescription() {
		return _roleDescription;
	}
	public void setRoleLevel(String roleDescription){
		this._roleDescription = roleDescription;
	}

	public String getSpecialisation() {
		return _specialisation;
	}
	public void setSpecialisation(String specialisation){
		this._specialisation = specialisation;
	}


	@Override
	public String toString(){
		return super.toString() + String.format("role Title :%c, role Description: %s ,specialisation : %s.",
			this._roleTitle,this._roleDescription,this._specialisation);
	}

} // end of class
