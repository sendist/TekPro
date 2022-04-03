
public class TestShape {
	public static void main(String[] Args) {
		//new instance with default color and filling
		Shape shape1 = new Shape();
		System.out.println(shape1);

		//new instance with given color and filling
		Shape shape2 = new Shape("blue", false);
		System.out.println(shape2);
		
		//test rectangle
		Rectangle rectangle1 = new Rectangle(3.0, 7.0, "white", false);
		System.out.println(rectangle1);
		
		//test circle
		Circle circle1 = new Circle(10.0);
		System.out.println(circle1);
		
		//test square
		Square square1 = new Square(5.0);
		System.out.println(square1);
	}

}
