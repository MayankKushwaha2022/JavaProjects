abstract class Example {
abstract void method();
abstract void displayText();

}

class Demo1 extends Example {
void displayText() {};
void method() {

System.out.println("Method body is executed.");

}

};

class ExampleMain {

public static void main ( String args [ ] )

{

Example e = new Demo1();

e.method();
// below casting is done:
//((Demo) e).method();

}

}