package sample;

public class Car implements SoundInterface {
	public String name;
	String carSound;
	
	public Car () {
		name = "Car";
		carSound = "CAR SOUNDS";
	}

	public void print() {
		System.out.print("I'm a " + name + "\n");
	}
	
	public String getName() {
		return name;
	}

	@Override
	public String getSoundInformation() {
		// TODO Auto-generated method stub
		return carSound;
	}

	
	/*
	 * @Override public void makeSounds() { // TODO Auto-generated method stub
	 * System.out.println(carSound + "!!!"); }
	 */
	 
}
