package sample;
import java.util.ArrayList;

public class Animal implements SoundInterface {
    int x_coord;
    int y_coord;
    int moveSpeed;
    String animalSound;
    
    public Animal() {
        x_coord = 0;
        y_coord = 0;
        moveSpeed = 1;
        animalSound = "ANIMAL SOUNDS";
    }
    
    public void move() {
        x_coord += moveSpeed;
        y_coord += moveSpeed;
        System.out.println("Animal is walking at speed " + moveSpeed +". x=" + x_coord + ",y=" + y_coord);
    }
    
	@Override
	public String getSoundInformation() {
		// TODO Auto-generated method stub
		return animalSound;
	}

	//@Override
	//public void makeSounds() {
		// TODO Auto-generated method stub
		//System.out.println(animalSound + "!!!");
	//}

	public static void main (String args[]) {
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		
		Animal a1 = new Animal();
		Animal a2 = new Fish();
		Animal a3 = new Frog();
		Animal a4 = new Bird();
		Animal a5 = new Penguin();
		
		Car c1 = new Car();
		Car c2 = new Ford();
		Car c3 = new GM();
		
		// SoundInterface si = new Animal();
		
		ArrayList<SoundInterface> noiseMakers = new ArrayList<SoundInterface>();
		noiseMakers.add(a1);
		noiseMakers.add(a2);
		noiseMakers.add(a3);
		noiseMakers.add(a4);
		noiseMakers.add(a5);
		noiseMakers.add(c1);
		noiseMakers.add(c2);
		noiseMakers.add(c3);
		
		for (int i=0; i < noiseMakers.size(); ++i) {
			//System.out.println("noiseMakers.get(i): " + noiseMakers.get(i));
			System.out.println("Sound: " + noiseMakers.get(i).getSoundInformation());
			//noiseMakers.get(i).makeSounds();
		}
		
		System.out.println("----------------");
		
		animalList.add(a1);
		animalList.add(a2);
		animalList.add(a3);
		animalList.add(a4);
		animalList.add(a5);
		
		int loop = 2;
		while (loop > 0) {
			for(int i = 0; i < animalList.size(); i++) {
				animalList.get(i).move();
				
				  try { 
					  Thread.sleep(2); 
					  } catch (InterruptedException e) { 
						  // TODO Auto-generated catch block 
						  e.printStackTrace(); }
				 
			}
			--loop;
		}
	}

}