abstract class One {
abstract void calculate(int i);
}

class Two extends One {
    void calculate(int a) {
    System.out.println(a+a);
    }
}

class Three extends One {
void calculate(int a) {
System.out.println(a*a);
}
}

class AddAndMultiply {
public static void main(String args[])
{
One obj1 = new Two();
obj1.calculate(2);

One obj2 = new Three();
obj2.calculate(2);
}
}