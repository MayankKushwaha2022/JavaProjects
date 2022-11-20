import java.awt.Rectangle;
import java.awt.Shape;

public class Graphics {
    static void draw(Shape shape) {
        System.out.println("draws a general shape");
    }
     
    static void draw(Circle circle) {
        System.out.println("draws a circle");
    }
     
    static void draw(Rectangle rectangle) {
        System.out.println("draws a rectangle");
    }  
}