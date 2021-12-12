package org.mustertech.javapoints.classvsiface;

public abstract class Shape {
	protected String name;

	protected Shape(String name) {
		this.name = name;
	}

	abstract public double perimeter();

	abstract public double area();
}
