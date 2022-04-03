
public class Shape {
	//Private instance variable
	private String color;
	private boolean filled;
	
	//Constructor 1
	public Shape() {
		this.color = "green";
		this.filled = true;
	}
	
	//Constructor 2
	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	//getter and setter
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	@Override
	public String toString() {
		if(filled == true) {
			return "A shape with color of " + color + " and filled";
		}
		return "A shape with color of " + color + " and Not filled";
	}
	
}
