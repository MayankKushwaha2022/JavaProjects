
public class Frog extends Animal {

	public Frog() {
		moveSpeed=3;
	}
	
	@Override
	// Overriding method
	public void move() {
		x_coord += moveSpeed;
		y_coord += moveSpeed;
		System.out.println("Frog is jumping at speed " + moveSpeed + ", x=" + x_coord + ",y=" + y_coord);
}
	public String toString() {
		return "Frog is jumping at speed " + moveSpeed + ", x=" + x_coord + ",y=" + y_coord;
	}
}
