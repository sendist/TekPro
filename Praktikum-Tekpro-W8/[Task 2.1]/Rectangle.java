
public class Rectangle extends Shape{
	//Private instance
	private double width;
	private double length;
	
	//Constructor 1
	public Rectangle() {
		this.width = 1.0;
		this.length = 1.0;
	}
	
	//Constructor 2
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	//Constructor 3
	public Rectangle(double width, double length, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}

	//getter and setter
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	//Method to return area of rectangle
	public double getArea() {
		return length*width;
	}
	
	//Method to return perimeter of rectangle
	public double getPerimeter() {
		return 2*length + 2*width;
	}
	
	@Override
	public String toString() {
		return "A Rectangle with width="+ width + " and length=" + length + ", which is a subclass of " + super.toString();
	}
}
