
public class CircleConstructorOverloading {

	public static void main(String[] args) {

		// creates a circle with defaults
		Circle circle1 = new Circle();
		System.out.println(circle1);
		 
		// creates a circle with R=50 and default center
		Circle circle2 = new Circle(50);
		System.out.println(circle2);
		 
		// creates a circle with R=100, center(x, y) = (50, 70)
		Circle circle3 = new Circle(100, 50, 70);
		System.out.println(circle3);
	}

}
