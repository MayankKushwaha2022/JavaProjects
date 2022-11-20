
public class Bird extends Animal {
	
	public Bird() {
		moveSpeed=10;
	}
	
	@Override
	// Overriding method
	public void move() {
		x_coord += moveSpeed;
		y_coord += moveSpeed;
		System.out.println("Bird is flying at speed " + moveSpeed + ", x=" + x_coord + ",y=" + y_coord);
}
	
	 public String toString() {
		 return "Bird is flying at speed " + moveSpeed + ", x=" + x_coord + ",y=" + y_coord;
	 }
}

