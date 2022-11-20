
public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int a[][] = new int[4][4];
		int a[][] = {{1,5,8,6},{7,2,5,4},{3,6,9,2},{5,7,4,3}};
		
		// printing the 2d-Array (Matrix)
		System.out.println("2d Array (also called a Matrix): ");
		for (int i=0;i<a.length;i++) {
			System.out.println();
			for (int j=0;j<a.length;j++) {
				System.out.println(a[i][j]);
			}
			
		}
		
		//Sum of row elements
		for (int i=0;i<4;i++) {
			int sum = 0;
			for (int j=0;j<4;j++) {
				sum = sum + a[i][j];
				
			}
			System.out.println("Sum of row " + (i+1) + " is: " + sum);
	}
	}
}
