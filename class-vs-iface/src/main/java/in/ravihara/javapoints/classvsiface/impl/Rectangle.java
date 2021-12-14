package in.ravihara.javapoints.classvsiface.impl;

import in.ravihara.javapoints.classvsiface.Shape;

public class Rectangle extends Shape {
	private double height;
	private double width;

	public Rectangle(double height, double width) {
		super("Rectangle");

		this.height = height;
		this.width = width;
	}

	@Override
	public double perimeter() {
		return (2 * (this.height + this.width));
	}

	@Override
	public double area() {
		return (this.height * this.width);
	}
}
