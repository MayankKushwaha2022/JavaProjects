package sample;

public class GM extends Car {
	public String name;
	
	public GM () {
		name = "GM";
		carSound = "GM SOUNDS";
	}
	public void print() {
        System.out.println("GMs suck");
    }
}