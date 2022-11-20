
public class Rough1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(3);
		System.out.println(); // println command used to go to next line.
		System.out.println(5);
		
		System.out.println("Right angled Triangle:");
		for (int i = 1; i <= 10; i++) {
 			System.out.println();
 			for (int j = 0; i>j; j++) {
 				System.out.print("*" + "   ");
 			}
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Upside down triangle:");
		
		for (int i = 1; i <= 10; i++) {
 			System.out.println();
 			for (int j = 10; j>=i; j--) {
 				System.out.print("*" + "   ");
 			}
		}
		
		for (int i = 1; i <= 4; i++) {
 			System.out.println();
 			for (int j = 1; j<=4; j++) {
 				System.out.print(1);
 			}
		}
		
		System.out.println();
		System.out.println();
		
		Integer[] intArray = {1,2,3,4,5};
		
		for(int index = 0; index < intArray.length; index++) {
            System.out.print(intArray[index] + " ");}
		
		System.out.println();
		System.out.println();
		
		for(int index = 0; index < intArray.length; index++) {
            System.out.println(intArray[index] + " ");}
		
		System.out.println();
		System.out.println();
		
		final int[][] matrx = {
				{ 11, 22, 56, 89, 30},
				{ 41, 52, 21, 30},
				};
		System.out.println(matrx.length);
		
				for (int r = 0; r < matrx.length; r++) {       //for loop for row iteration.
				for (int c = 0; c < matrx[r].length; c++) {   //for loop for column iteration.
				System.out.print(matrx[r][c] + " ");
				
				}
				System.out.println();
				//using this for new line to print array in matrix format.
				}
				
				System.out.println();
				System.out.println();
		
		
		int[][] patients = { { 2200, 1100, 1200, 1000, 1015, 2000, 1092, 2204 },
				{ 5020, 6105, 2009, 9047, 1016, 2014, 2708, 2308 }, { 1720, 2406, 3054, 1018, 1023, 3100, 1406, 1502 },
				{ 1490, 2002, 2016, 5008, 2044, 1055, 1607, 2201 }, { 1520, 1007, 1092, 2065, 1023, 1010, 1046, 1502 },
				{ 1670, 1201, 2008, 2001, 1086, 1009, 1041, 1706 }, { 1870, 2001, 2078, 1006, 1053, 1702, 1009, 1406 }

		};
		
				
		  for (int r = 0; r < patients.length; r++) {       //for loop for row iteration.
				for (int c = 0; c < patients[r].length; c++) {   //for loop for column iteration.
				System.out.print(patients[r][c] + " ");
				}
				System.out.println(); //using this for new line to print array in matrix format.
				}
		

}}
