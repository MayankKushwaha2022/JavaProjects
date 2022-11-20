abstract class One {

abstract void method();

}

class Two extends One {

void method() {

System.out.println("First extended class is executed");

}

};

class Three extends One {

void method() {

System.out.println("Second extended class is executed");

}

};

class ekdoteenMain {

public static void main ( String args [ ] )

{

One o = new Two();

o.method();

One o1 = new Three();

}

}