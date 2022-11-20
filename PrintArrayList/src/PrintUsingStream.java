import java.util.ArrayList;
public class PrintUsingStream {

	public static void main(String[] args) {
		ArrayList<String> fruitList = new ArrayList<>();
		 
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Grapes");
        fruitList.add("Orange");
        System.out.println("Elements of ArrayList are:");
 
        fruitList.stream().forEach(System.out::println);
	}

}
