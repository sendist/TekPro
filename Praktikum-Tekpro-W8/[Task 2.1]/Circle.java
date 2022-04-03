
public class Circle extends Shape {
	//Private instance
	private double radius;
	
	//Constructor 1
	public Circle() {
		this.radius = 1.0;
	}
	
	//Constructor 2
	public Circle(double radius) {
		this.radius = radius;
	}
	
	//Constructor 3
	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}

	//getter
	public double getRadius() {
		return radius;
	}

	//setter
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//Method to return the area of circle
	public double getArea() {
		return Math.PI*radius*radius;
	}
	
	//Method to return the perimeter of circle
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}
	
	@Override
	public String toString() {
		return "A circle with radius=" + radius + ", which is a subclass of " + super.toString();
	}
}
