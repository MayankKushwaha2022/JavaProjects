package sample;

public class Ford extends Car {
	public String name;
	
	public Ford () {
		name = "Ford";
		carSound = "FORD SOUNDS";
	}

	public void print() {
		print("Fords go fast");
	}
	
	public void print(String outputString) {
        System.out.println(outputString);
    }
	
	public String getName() {
		return name;
	}
}
