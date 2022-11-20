/*
 * Points to Remember
 * There are certain points to remember while implementing abstraction in our programs:
 * a. Abstract classes cannot have objects.
 * b. If there is a single abstract method in a class, then the class must be an abstract class.
 * c. An abstract class may have concrete methods.
 * d. Abstract classes support non-final variables.
 * e. When you inherit an abstract class into a child class, you must override all the methods in the abstract class or make the child class abstract.
 */
interface inface {
  void func1();
  void func2();
  //void func3();
}
abstract class Class1 implements inface {
  public void func2() {
    System.out.println("I am the second function!");
  }
  //This class does not override all functions hence this is also abstract
}
class Class2 extends Class1 {
  public void func1() {
    System.out.println("I am the first function!");
  }
}
class Abstraction {
  public static void main(String args[]) {
    Class2 obj = new Class2();
    obj.func1();
    obj.func2();
  }
}