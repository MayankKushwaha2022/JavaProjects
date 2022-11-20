
public class Food {
	
	String flavor;
	
	public Food() {
		flavor = "flavouur!!!";
	}
	
	public void taste() {
		System.out.println("Food has: " + flavor);
	}
	
	public String toString() {
		return "Food has: " + flavor;
	}
}
