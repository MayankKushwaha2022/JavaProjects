interface in {
  void run();
  static void statmethod() //static method
  {
    System.out.println("This is a static method");
  }
  default void sleep() //default method
  {
    System.out.println("Both humans and dogs love to sleep");
  }
}
class Dog implements in {
  public void run() {
    System.out.println("A dog runs with the help of four legs");
  }
}
class Human implements in {
  public void run() {
    System.out.println("A human runs with the help of two legs");
  }
}
class Interface {
  public static void main(String[] args) {
    Dog d = new Dog();
    d.run();
    Human h = new Human();
    h.run(); 
    in .statmethod();
    h.sleep();
  }
}