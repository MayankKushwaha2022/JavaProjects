class Chaining3
{
    // block to be executed before any constructor.
    {
        System.out.println("init block");
    }
 
    // no-arg constructor
    Chaining3()
    {
        System.out.println("default");
    }
 
    // constructor with one argument.
    Chaining3(int x)
    {
        System.out.println(x);
    }
 
    public static void main(String[] args)
    {
        // Object creation by calling no-argument
        // constructor.
        new Chaining3();
 
        // Object creation by calling parameterized
        // constructor with one parameter.
        new Chaining3(10);
    }
}