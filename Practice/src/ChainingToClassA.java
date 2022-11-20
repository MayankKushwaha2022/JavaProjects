
class ChainingToClassA extends ClassA
{
    // constructor 3
	ChainingToClassA()
    {
        System.out.println("No-argument constructor " +
                           "of ChainingToClassA");
    }
 
    // parameterized constructor 4
	ChainingToClassA(String Mayank1)
    {
        // invokes ClassA constructor 2
        super(Mayank1);
        System.out.println("Calling parameterized " +
                           "constructor of ChainingToClassA");
    }
 
    public static void main(String args[])
    {
        // calls parameterized constructor 4
    	ChainingToClassA obj = new ChainingToClassA("test");
 
        // Calls No-argument constructor
        // Derived obj = new Derived();
    }
}