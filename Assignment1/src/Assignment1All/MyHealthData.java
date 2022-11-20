package Assignment1All;

/**
 * File name [MyHealthData.java ]
 * 
 * @author Mayank Kushwaha, 
 * ID#041003071 
 * Course: 22F CST8284 – OOP
 * [Assignment-1] 
 * Date: [3 Nov 2022] 
 * Professor [Justin Martins] 
 * Purpose:[This system maintains important health information about a patient.]
 * @version [1]
 */
//import java.time.LocalDate;
//
//Note: This class assumes values passed to the set methods are correct.
// REVIEW THIS FILE AND ASSIGNMENT INSTRUCTIONS CAREFULLY BEFORE YOU START OFF!!

//TO DO 1: INCLUDE YOUR ATTRIBUTES HERE. REMEMBER TO CHECK THE UML CLASS DIAGRAM TO INCLUDE ALL ATTRIBUTES LISTED AND THEIR TYPES.
/**
 * 
 * @author Mayank Kushwaha
 *
 */
//START CODE

public class MyHealthData {
	/**This is users first name.*/
	private String firstName;
	/**This is users last name.*/
	private String lastName;
	/**This is users gender.*/
	private String gender;
	/**This is users birth year.*/
	private int birthYear;  
	/**This is systems current year.*/
	private int currentYear; 
	/**This is users height.*/
	private double height; 
	/**This is users weight.*/
	private double weight; 

//END CODE
/**
 * 
 * @param fname. This is users first name.
 * @param lastName. This is users last name.
 * @param gender. This is users gender.
 * @param birthYear. This is users birth year.
 * @param currentYear. This is systems current year.
 * @param height. This is users height.
 * @param weight. This is users weight.
 */
// TO DO 2: INCLUDE YOUR CONSTRUCTOR HERE 
//START CODE
	public MyHealthData(String fname, String lastName, String gender, int birthYear, int currentYear, double height,
			double weight) {
		this.firstName = fname;
		this.lastName = lastName;
		this.gender = gender;
		this.birthYear = birthYear;
		this.currentYear = currentYear;
		this.height = height;
		this.weight = weight;

	}
//END CODE

//TO DO 3: INCLUDE YOUR SET AND GET METHODS HERE. CHECK THE UML CLASS TO ENSURE ALL ARE COMPLETE. SOME ARE ALREADY PROVIDED FOR YOU BELOW.
/**
 * @return firstName. This is first name getter.
 */
	public String getFirstName() {
		return firstName;
	}
/**
 * @param firstName. This is first name setter.
 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
/**
 * @return lastName. This is last name getter.
 */
	public String getLastName() {
		return lastName;
	}
/**
 * @param lastName. This is last name setter.
 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
/**
 * @return gender. This is gender getter.
 */
	public String getGender() {
		return gender;
	}
/**
 * @param gender. This is gender setter.
 */
	public void setGender(String gender) {
		this.gender = gender;
	}
/**
 * @return birthYear. This is birthYear getter.
 */
	public int getBirthYear() {
		return birthYear;
	}
/**
 * @param birthYear. This is birthYear setter.
 */
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
/**
 * @return currentYear. This is CurrentYear getter.
 */
	public int getCurrentYear() {
		return currentYear;
	}
/**
 * @param currentYear. This is current Year setter.
 */
	public void setCurrentYear(int currentYear) {
		this.currentYear = currentYear;
	}
/**]
 * @return height. This is height getter.
 */
	public double getHeight() {
		return height;
	}
/**]
 * @param height. This is height setter.
 */
	public void setHeight(double height) {
		this.height = height;
	}
/**
 * @return weight. This is weight getter.
 */
	public double getWeight() {
		return weight;
	}
/**
 * @param weight. This is weight setter.
 */
	public void setWeight(double weight) {
		this.weight = weight;
	}
/**
 * This is Date of birth getter returning values in YYYY-MM-DD format.
 * @return birthYear
 */
	public int getDOB() {
		//return birthYear+"-"+birthMon+"-"+birthDay;
		//System.out.printf(birthYear+"-"+birthMon+"-"+birthDay);
		//return (birthYear+"-"+birthMon+"-"+birthDay).toString();
		return (currentYear-birthYear);
	}
/**
 * THis is a setter for all three variables.
 * @param birthYear. This is a Setter Variable.
 */
	  public void setDOB(int birthYear) {
	  this.birthYear=birthYear; 
	  }
/**
 * Returns the difference between current year and the year user is born.
 * @return currentYear. This is getter variable. 
 */
	public int getAge() {
		return currentYear - birthYear;
	}
/**
 * @return Age. This method returns the maximum heart rate
 */
	public int getmaximumHeartRate() {
		return 220 - getAge();
	}
/**
 * This method returns the minimum heart rate.
 * @return minimum heart rate. 
 */
	public int getMinimumTargetHeartRate() {
		return 50 * getmaximumHeartRate() / 100;
	}
/**
 * This method returns the maximum heart rate.
 * @return maximum heart rate
 */
	public int getMaximumTargetHeartRate() {
		return 85 * getmaximumHeartRate() / 100;
	}
// THIS RETURNS THE PATIENT'S Body Mass Index (BMI) AND IT IS PROVIDED HERE FOR YOU. DO NOT CHANGE THIS PIECE OF CODE!
/**
 * This method returns the Body Mass Index.
 * @return BMI. This methods returns the BMI value.
 */
	public double getBMI() {
		return (getWeight() * 703) / (getHeight() * getHeight());
	}
/**
 * This method returns both the parameters.
 * @param weight. This is a setter variable. 
 * @param height. This is a setter variable.
 */
	public void setBMI(double weight, double height) {
		this.height = height;
		this.weight = weight;
	}
// TO DO 4: THIS PORTION OF CODE SHOULD DISPLAY ALL THE PATIENT'S HEALTH DATA. DO NOT MISS ANY DATA / INFORMATION
//TO DO 5: HINT: YOU MUST USE System.out.printf TO SHOW ALL HEALTH DATA. DO NOT MISS ANY ITEM.
//START CODE
/**
 * This method displays all the data entered by the user.
 */
	public void displayMyHealthData() {
		System.out.printf("Patient's FirstName: %s%n", firstName);
		System.out.printf("Patient's LastName: %s%n", lastName);
		System.out.printf("Patient's Gender: %s%n", gender);
		//System.out.printf("Patient's Date of Birth: %n", DOB);
		System.out.printf("Patient's Date of Birth: %s%n", getDOB());
		System.out.printf("Patient's Height: %f%n", getHeight());
		System.out.printf("Patient's Weight: %f%n", getWeight());
		System.out.printf("Patient's Age: %d%n", getAge());
		System.out.printf("Patient's BMI: %f%n", getBMI());
		System.out.printf("Patient's Maximum Heart Rate: %d%n", getmaximumHeartRate());
		System.out.printf("Patient's Target Heart Rate Range-> Min: %d to Max: %d%n", getMinimumTargetHeartRate(),
				getMaximumTargetHeartRate());

//END CODE

//DO NOT MODIFY THIS PROTION OF CODE. IT SHOULD PRINT AS IT IS - ALREADY PROVIDED FOR YOU!!

		System.out.println("BMI VALUES");
		System.out.println("Underweight: less than 18.5");
		System.out.println("Normal:      between 18.5 and 24.9");
		System.out.println("Overweight:  between 25 and 29.9");
		System.out.println("Obese:       30 or greater");
	}

} // end class MyHealthData
