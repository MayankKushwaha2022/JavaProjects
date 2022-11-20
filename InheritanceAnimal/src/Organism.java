import java.util.ArrayList;
public class Organism {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		Animal a1 = new Animal();
		Fish fish1 = new Fish();
		Frog frog1 = new Frog();
		Bird b1 = new Bird();
		
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		
		animalList.add(a1);
		animalList.add(fish1);
		animalList.add(frog1);
		animalList.add(b1);
		
		for(int i=0; i<animalList.size();i++) {
			System.out.println(animalList.get(i));
		}
		
	}

}
