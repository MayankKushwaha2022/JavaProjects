abstract class Area1 {}

class Circle extends Area1 {
void area (float r) {System.out.println(Math.PI*r*r);}
};

class Areamain {
public static void main(String args[])
{
Area1 a = new Circle();
a.area1(3.0);
}
}