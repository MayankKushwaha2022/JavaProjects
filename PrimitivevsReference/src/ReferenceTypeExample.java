
/**
 * In the below example, the modifyAndSum() method does not change the original array because, inside this method, 
 * we are creating the copy of the array and doing operations on this copied array. That’s why before and after the 
 * modifyAndSum() method inside our test the sum of the array elements are the same. However, we send the reference 
 * of the array to the sum() method that’s why in the sum() method we are changing the original array. 
 * This is called “pass by reference” in programming.
 */
import java.util.Arrays;

public class ReferenceTypeExample {
	public static void main(String[] args) {
		int[] myArr = new int[] { 4, 5 };

		System.out.println("Before modifyAndSum method:" + (myArr[0] + myArr[1])); // The sum of the numbers in the
																					// array before everything.
		modifyAndSum(myArr);
		System.out.println("After modifyAndSum method:" + (myArr[0] + myArr[1])); // modifyAndSum method did not change
																					// original array.
		sum(myArr);
		System.out.println("After sum method: " + (myArr[0] + myArr[1])); // Sum method changed myArr because of
																			// reference type!
	}

	private static void modifyAndSum(int[] arr) {
		arr = Arrays.copyOf(arr, arr.length); // Here, we are creating a new array! The modifications won't affect
												// original array.
		arr[0]--;
		System.out.println("Inside modifyAndSum method: " + (arr[0] + arr[1]));
	}

	private static void sum(int[] arr) {
		System.out.println("Inside sum method: " + (arr[0] + arr[1])); // Here we are adding values of original array.
		arr[0]--; // Here, we are modifying the original array because we sent as reference.
	}
}