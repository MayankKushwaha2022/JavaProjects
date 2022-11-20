
public class Potato extends Food{
	
	public Potato() {
		flavor = "Sour";
	}
	
	@Override
	public void taste() {
		System.out.println("Potatoes are: " + flavor);
	}
	
	public String toString() {
		return "Potatoes are: " + flavor;
	}
}
