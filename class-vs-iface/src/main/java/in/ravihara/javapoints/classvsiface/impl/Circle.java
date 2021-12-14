package in.ravihara.javapoints.classvsiface.impl;

import in.ravihara.javapoints.classvsiface.Shape;

public class Circle extends Shape {
	private double radius;

	public Circle(double radius) {
		super("Circle");

		this.radius = radius;
	}

	@Override
	public double perimeter() {
		return (2 * Math.PI * this.radius);
	}

	@Override
	public double area() {
		return (Math.PI * Math.pow(this.radius, 2));
	}
}
