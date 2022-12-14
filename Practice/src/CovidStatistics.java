
/**
 * TASK: Remember to include all necessary headers for your Javadoc,
 * descriptions and explanations of what you have done in the appropriate
 * places. ENSURE that you add appropriate Javadoc style comments to relevant
 * parts of this code as you update this program to show that you understand it.
 *
 * @author - various - put your own name here
 * 
 */

public class CovidStatistics {
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

		System.out.println("            " + provinces[0] + "      " + patients[0][0] + "    " + patients[0][1] + "    "
				+ patients[0][2] + "    " + patients[0][3] + "    " + patients[0][4] + "    " + patients[0][5] + "    "
				+ patients[0][6] + "    " + patients[0][7]);
		System.out.println("             " + provinces[1] + "      " + patients[1][0] + "    " + patients[1][1] + "    "
				+ patients[1][2] + "    " + patients[1][3] + "    " + patients[1][4] + "    " + patients[1][5] + "    "
				+ patients[1][6] + "    " + patients[1][7]);
		System.out.println("        " + provinces[2] + "      " + patients[2][0] + "    " + patients[2][1] + "    "
				+ patients[2][2] + "    " + patients[2][3] + "    " + patients[2][4] + "    " + patients[2][5] + "    "
				+ patients[2][6] + "    " + patients[2][7]);
		System.out.println("      " + provinces[3] + "      " + patients[3][0] + "    " + patients[3][1] + "    "
				+ patients[3][2] + "    " + patients[3][3] + "    " + patients[3][4] + "    " + patients[3][5] + "    "
				+ patients[3][6] + "    " + patients[3][7]);
		System.out.println("           " + provinces[4] + "      " + patients[4][0] + "    " + patients[4][1] + "    "
				+ patients[4][2] + "    " + patients[4][3] + "    " + patients[4][4] + "    " + patients[4][5] + "    "
				+ patients[4][6] + "    " + patients[4][7]);
		System.out.println("   " + provinces[5] + "      " + patients[5][0] + "    " + patients[5][1] + "    "
				+ patients[5][2] + "    " + patients[5][3] + "    " + patients[5][4] + "    " + patients[5][5] + "    "
				+ patients[5][6] + "    " + patients[5][7]);
		System.out.println(provinces[6] + "     " + patients[6][0] + "    " + patients[6][1] + "    " + patients[6][2]
				+ "    " + patients[6][3] + "    " + patients[6][4] + "    " + patients[6][5] + "    " + patients[6][6]
				+ "    " + patients[6][7]);
		
		
		System.out.println();
		System.out.println();
	
		
		System.out.println("              Month         Feb     March   April    May    June    July    Aug     Sept");
		System.out.println();
		
		for (int r = 0; r < patients.length; r++) { //for loop for row iteration.
			System.out.print("              "+provinces[r] + "   ");
			for (int c = 0; c < patients[r].length; c++) {//for loop for column iteration.
				
				System.out.print("  "+patients[r][c] + "  ");
			}
			System.out.println(); //using this for new line to print array in matrix format.
			}

		/**
		 * TASK: It is important to know the number of spice traders per city. So you
		 * need to print out the number of traders for all cities (content of the array)
		 * for each month. Update the code in this section by using a nested for loop.
		 * 
		 */

		// TO DO: WRITE YOUR CODE FOR THIS SECTION HERE!!!! Check the sample output file
		// (SpiceOutput) to see the expected pattern to print out these details using
		// printf.

		/*
		 * for (String spiceTraders: provinces) { //System.out.println("              "
		 * + spiceTraders); System.out.printf("%s", "              " + spiceTraders +
		 * "\n"); }
		 */

		/**
		 * TASK: Update the code in this section by writing a nested for loop (for the
		 * columns and rows of the array) to compute the sum (column). Print the column
		 * sum using printf. Check the sample output file (SpiceOutput) to see the
		 * expected pattern.
		 */

		System.out.println();
		System.out.print("  Recovered Patients");

		// TO DO: INSERT CODE HERE FOR THIS SECTION!!! Check the sample output file
		// (SpiceOutput) to see the expected pattern.

		System.out.println();
		System.out.println();
		System.out.println("               Vaccinate and maintain good health practices!");
	}
}
