package org.generation.java.Polymorphism.AbstractClass;

public class Circle extends Shape {
	private final double _radius;
	final double _pi = Math.PI;

	public Circle(double radius) {
		this._radius = radius;
	}

	@Override
	public double area() {
		// A = π r^2
		return this._pi * Math.pow(this._radius, 2);
	}

	@Override
	public double perimeter() {
		// P = 2πr
		return 2 * this._pi * this._radius;
	}

	@Override
	public String toString()
	{
		return String.format("Radius : %.2f", this._radius) + super.toString();
	}


} //
