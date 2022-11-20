import java.awt.Rectangle;

public class GraphicsMethodOverloading {

	public static void main(String[] args) {

	    Graphics graphics = new Graphics();
	    
	    graphics.draw(new Shape());
	    graphics.draw(new Circle());
	    graphics.draw(new Rectangle());
	}

}
