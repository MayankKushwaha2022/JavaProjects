
public class Fish extends Animal{

	public Fish() {
		moveSpeed=3;
	}
	
	@Override
	// Overriding method
	public void move() {
		x_coord += moveSpeed;
		y_coord += moveSpeed;
		System.out.println("Fish is swimming at speed " + moveSpeed + ", x=" + x_coord + ",y=" + y_coord);
}
	
	public String toString() {
		return "Fish is swimming at speed " + moveSpeed + ", x=" + x_coord + ",y=" + y_coord;
	}
}
