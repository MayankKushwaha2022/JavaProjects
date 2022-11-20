class Chaining4
{
    // block to be executed first
    {
        System.out.println("init");
    }
    Chaining4()
    {
        System.out.println("default");
    }
    Chaining4(int x)
    {
        System.out.println(x);
    }
 
    // block to be executed after the first block
    // which has been defined above.
    {
        System.out.println("second");
    }
    public static void main(String args[])
    {
        new Chaining4();
        new Chaining4(10);
    }
}