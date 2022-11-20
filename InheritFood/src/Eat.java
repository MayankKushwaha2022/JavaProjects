import java.util.ArrayList;
public class Eat {

	public static void main(String[] args) {
		
		System.out.println("This is the main Eat class program");
		
		Food F = new Food();
		Food R = new Rice();
		Food Pot = new Potato();
		Food Pep = new Pepper();
		
		ArrayList<Food> Foodlist = new ArrayList<Food>();
		
		Foodlist.add(F);
		Foodlist.add(R);
		Foodlist.add(Pot);
		Foodlist.add(Pep);
		
		for(int i=0; i<Foodlist.size(); i++) {
			System.out.println(Foodlist.get(i));
		}
	}

}
