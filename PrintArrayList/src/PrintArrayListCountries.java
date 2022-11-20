import java.util.ArrayList;
public class PrintArrayListCountries {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		 
        arrayList.add("India");
        arrayList.add("Australia");
        arrayList.add("Sudan");
        arrayList.add("Norway");
 
        System.out.println("Elements of ArrayList are:");
        for (String ele : arrayList) {
            System.out.println(ele);
        }
    }
	}


