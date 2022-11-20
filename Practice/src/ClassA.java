// Java program to illustrate Constructor Chaining to
// other class using super() keyword
class ClassA
{
    String Mayank2;
 
    // constructor 1
    ClassA()
    {
        this("");
        System.out.println("No-argument constructor of" +
                                           " ClassA");
    }
 
    // constructor 2
    ClassA(String name)
    {
        this.Mayank2 = name;
        System.out.println("Calling parameterized constructor"
                                              + " of ClassA");
    }
}
 