abstract class Area {
  abstract void area();
}
class Square extends Area {
  void area() {
    System.out.println("The area of a square is (side)^2");
  }
}
class Rectangle extends Area {
  void area() {
    System.out.println("The area of a rectangle is (length*breadth)");
  }
}
class Circle extends Area {
  void area() {
    System.out.println("The area of a circle is PI*radius*radius");
  }
}
public class AbstractClass {
  public static void main(String[] args) {
    Rectangle r = new Rectangle();
    r.area();
    Circle c = new Circle();
    c.area();
    Square s = new Square();
    s.area();
  }
}