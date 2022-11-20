abstract class Demo2 {
abstract void display1(String string);
}

class RealityShows extends Demo2 {
void display1(String text) {
System.out.println(text);
}
};

class Webseries extends Demo2 {
void display1(String text) {
System.out.println(text);
}
};

class DemoMain {
public static void main (String args [ ] ) 
{
Demo2 d = new RealityShows();
Demo2 d1 = new Webseries();

d1.display1("Telecasted in a pattern.");

}
}