/**
 * File name [KushwahaJavaDoc.java ]
 * 
 * @author mayank Kushwaha, ID#041003071 Course CST8284 – OOP Assignment:
 *         [Lab-2] Date: [23 September 2022] Professor [Justin Martins] Purpose:
 *         [This java class is made to print a 2D Array. Class list None.
 * @version [2]
 */

public class CovidStatistics {
	/**
	 * Main Method
	 * 
	 * @param args Default Arguments
	 */
	public static void main(String[] args) {

		final int ROWS = 7;
		final int COLUMNS = 8;

		int[][] patients = { { 2200, 1100, 1200, 1000, 1015, 2000, 1092, 2204 },
				{ 5020, 6105, 2009, 9047, 1016, 2014, 2708, 2308 }, { 1720, 2406, 3054, 1018, 1023, 3100, 1406, 1502 },
				{ 1490, 2002, 2016, 5008, 2044, 1055, 1607, 2201 }, { 1520, 1007, 1092, 2065, 1023, 1010, 1046, 1502 },
				{ 1670, 1201, 2008, 2001, 1086, 1009, 1041, 1706 }, { 1870, 2001, 2078, 1006, 1053, 1702, 1009, 1406 }

		};

		String[] provinces = { "Ontario", "Quebec", "Nova Scotia", "New Brunswick", "Manitoba", "British Columbia",
				"Prince Edward Island" };

		System.out.println("              Month      Feb     March   April    May    June    July    Aug     Sept");
		System.out.println();

		// System.out.println(patients.length);

		for (int r = 0; r < patients.length; r++) { // for loop for row iteration.
			System.out.printf("%25s", provinces[r] + "   ");

			for (int c = 0; c < patients[r].length; c++) {// for loop for column iteration.

				System.out.print(patients[r][c] + "\t");// using this for new line to print array in matrix format.
			}
			System.out.println();
		}

		System.out.println();
		System.out.printf("%22s", "Recovered Patients");

		for (int i = 0; i < COLUMNS; i++) {
			int sum = 0;
			for (int j = 0; j < ROWS; j++) {
				sum = sum + patients[j][i]; // sum of column elements

			}
			System.out.printf("%8s", sum);
			sum = 0;
		}

		System.out.println();
		System.out.println();
		System.out.printf("%50s", "Vaccinate and maintain good health practices!");
	}
}
