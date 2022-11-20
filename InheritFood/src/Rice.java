
public class Rice extends Food {

	public Rice() {
		flavor = "Sweet";
	}
	
	@Override
	public void taste() {
		System.out.println("Rice is: " + flavor);
	}
	
	public String toString() {
		return "Rice is: " + flavor;
	}
}
