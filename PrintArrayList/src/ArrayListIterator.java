import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListIterator {

	public static void main(String[] args) {
		   ArrayList<String> arList = new ArrayList<>();
		   
	        arList.add("MacOS");
	        arList.add("Windows");
	        arList.add("ChromeOS");
	        arList.add("Linux");
	        arList.add("Ubuntu");
	 
	        System.out.println("Elements of ArrayList are:");
	        Iterator<String> arItr = arList.iterator();
	        while(arItr.hasNext())
	        {
	            String ele = arItr.next();
	            System.out.println(ele);
	        }
	    }
	}

