public class Mercedes extends Car {
  public void Accelerate() {
    System.out.println("The Mercedes Benz S-class accelerates like this!");
  }
  public void Brake() {
    System.out.println("The Mercedes Benz S-class brakes like this!");
  }
  public static void main(String[] args) {
    Mercedes c = new Mercedes();
    c.Accelerate();
    c.Brake();
  }
}