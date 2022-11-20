/**
 * 
 * @author mayank Kushwaha
 * Rules:
 * The argument list of overriding method  (method of child class) must match 
 * the Overridden  method (the method of parent class) – type and  sequence.
 * 
 * Access modifier of the overriding method (method of  subclass) cannot be more restrictive than the overridden  method of parent class.
 * The private, static and final methods cannot be  overridden as they are local to the class. 
 * 
 * However, static  methods can be re-declared in the subclass. 
 * the sub-  class method would act differently and will have  nothing to do with the same static method of parent  class.

 *The binding of static, private and final methods is done at compile time. 
 *Note that this is because these method cannot be overridden and the type of the class is determined at the compile time

 */

class Human {
//Overridden method. This method is overridden as it is local to class. Should be public instead of private.
	private void dress() {
		System.out.println("Humans can wear clothes");
	}
}

class Girl extends Human {
//Overriding method  
	protected void dress() {
		System.out.println("Girls can wear dresses");
	}
}

class Boy extends Human {
	//Overriding method  
		protected void dress() {
			System.out.println("Boys can wear Suits");
		}	
}
public class OverridingClass {
	public static void main(String args[]) {
		Human obj = new Human();
		Girl obj1 = new Girl();
		Boy obj2 = new Boy();

		//obj.dress();
		//This will call the child class version of dress() 
		obj1.dress();
		obj2.dress();
	}
}
