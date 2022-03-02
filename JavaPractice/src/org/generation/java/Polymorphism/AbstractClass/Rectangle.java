package org.generation.java.Polymorphism.AbstractClass;


public class Rectangle extends Shape {

	private final double _width, _length; //sides

	public Rectangle(double width, double length) {
		this._width = width;
		this._length = length;
	}

	@Override
	public double area() {
		// A = w * l
		return this._width * this._length;
	}

	@Override
	public double perimeter() {
		// P = 2(w + l)
		return 2 * (this._width + this._length);
	}

	@Override
	public String toString()
	{
		return String.format("Width: %.2f, Length: %.2f, ", this._width, this._length) + super.toString();
	}

}
