package entities;

import entities.enums.Color;

public abstract class Shape {
	
	private Color color;
	
	public Shape() {}
	
	public Shape(Color color) {
		this.color = color;
	}
	
	public Color getColor() {
		return color;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	// Declara��o do m�todo abstrato "area"
	public abstract double area();

}
