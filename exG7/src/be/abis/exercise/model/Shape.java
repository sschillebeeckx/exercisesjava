package be.abis.exercise.model;

public abstract class Shape {
    
	 private String color;
	 private Point origin;

	 public Shape(String color, Point origin) {
		this.color = color;
		this.origin = origin;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public Point getOrigin() {
		return origin;
	}

	public void setOrigin(Point origin) {
		this.origin = origin;
	}

	public abstract double area();
	 
	 
}
