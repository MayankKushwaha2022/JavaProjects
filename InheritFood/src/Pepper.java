
public class Pepper extends Food{
	
	public Pepper() {
		flavor = "Spicy";
	}
	
	@Override
	public void taste() {
		System.out.println("Peppers are: " + flavor );
	}
	
	public String toString() {
		return "Peppers are: " + flavor;
	}

}
