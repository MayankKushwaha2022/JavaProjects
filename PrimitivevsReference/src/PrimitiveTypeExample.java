/**
 * Primitive types are behaving pass by value in Java and we will see this in
 * the below example. The value of the variable a is not changing after we are
 * modifying it in the modify method because we are sending the copy of the
 * variable a, not its reference. In this way, in the modify() method, we are
 * changing the “value of the copy a” not the “real a” or “reference of a”. In
 * programming, we are calling this behavior “pass by value”.
 * 
 * @author mayan
 *
 */
public class PrimitiveTypeExample {

	public static void main(String[] args) {
		int a = 8;
		System.out.println("Before Modify: " + a);
		modify(a);
		System.out.println("After Modify: " + a);
	}

	private static void modify(int a) {
		--a; // Here, the value of a will not change because a comes here not as reference.
		System.out.println("Inside the method the value of a: " + a);
	}

}
