public class PointTester {
   public static void main(String[] args) {
      Point point = new Point();
      System.out.println("X: " +point.x + ", Y: " + point.y);
      updatePoint(point);
      System.out.println("X: " +point.x + ", Y: " + point.y);
   }
   public static void updatePoint(Point point) {
      point.x = 200;
      point.y = 100;
   }
}
class Point {
   public int x, y;
}