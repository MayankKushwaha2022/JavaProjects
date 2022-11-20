
public class Animal {
		
		int x_coord;
		int y_coord;
		int moveSpeed;
		
		public Animal() {
			x_coord = 0;
			y_coord = 0;
			moveSpeed = 1;
		}
		
		// Overridden method 
		public void move() {
			x_coord += moveSpeed;
			y_coord += moveSpeed;
			System.out.println("Animal is walking at speed " + moveSpeed + ", x=" + x_coord + ",y=" + y_coord);
		}
		
		public String toString() {
			 return "Animal is walking at speed " + moveSpeed + ", x=" + x_coord + ",y=" + y_coord;
		}
}
