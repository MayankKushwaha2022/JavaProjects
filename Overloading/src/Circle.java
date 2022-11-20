public class Circle {
    private int radius;
    private int x;
    private int y;
 
    public Circle() {
        this.x = 10;
        this.y = 10;
        this.radius = 20;
    }
 
    public Circle(int radius) {
        this.radius = radius;
    }
 
    public Circle(int radius, int x, int y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }
    public String toString() {
    	return ("x is: " + x + ", y is: " + y + ", radius is: " + radius);
    }
    
}