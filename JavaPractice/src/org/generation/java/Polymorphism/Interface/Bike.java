package org.generation.java.Polymorphism.Interface;

public class Bike implements Vehicle {

	private int speed;
	private int gear;

	public Bike(int speed, int gear) {
		this.speed = speed;
		this.gear = gear;
	}

	// to change gear
	@Override
	public void changeGear(int newGear){

		this.gear = newGear + 2;
	}

	// to increase speed
	@Override
	public void speedUp(int increment){

		this.speed = this.speed + increment + 2;
	}

	// to decrease speed
	@Override
	public void applyBrakes(int decrement){

		this.speed = this.speed - decrement + 2;
	}

	@Override
	public String toString() {
		return String.format("Bike: speed: %d gear: %d", this.speed, this.gear);
	}

} // end of class

