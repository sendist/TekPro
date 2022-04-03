
public class Square extends Rectangle {
	//Constructor 1
	public Square() {
		super();
	}
	
	//Constructor 2
	public Square(double side) {
		super(side, side);
	}

	//Constructor 3
	public Square(double side, String color, boolean filled) {
		super(side, side, color, filled);
	}
	
	@Override
	public String toString() {
		return "A Square with side=" + getWidth() + ", which is a subclass of " + super.toString();
	}
	
	@Override
	public double getArea() {
		return getWidth()*getWidth();
	}
	
	@Override
	public double getPerimeter() {
		return 4*getWidth();

	}
	
	@Override
	public void setWidth(double width) {
		super.setWidth(width);
		super.setLength(width);
	}

	@Override
	public void setLength(double length) {
		super.setWidth(length);
		super.setLength(length);
	}
	
}
