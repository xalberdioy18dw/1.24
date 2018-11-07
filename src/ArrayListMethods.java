// We import the ArrayList class to play with it.
import java.util.ArrayList;
// We import the ListIterator class to play with it.
import java.util.ListIterator;
// We create a public class called "ArrayListMethods"
public class ArrayListMethods {
	//We create the main class.
	public static void main(String[] args) {
		//We create a new ArrayList with the name al.
		ArrayList <String> al = new ArrayList <String>();
		//We create the first element of the list.
		al.add("first element");
		//We create the second element of the list.
		al.add("second element");
		//We create the third element of the list.
		al.add("third element");
		//We create the fifth element of the list.
		al.add("fifth element");
		//We create the sixth element of the list.
		al.add("sixth element");
		//We insert "forth element" in the position 1.
		al.add(1, "forth element");
		// We create a ListIterator
		ListIterator it = al.listIterator();
		// We create a loop to know which elements are in the list.
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		// We create another loop to know what element is in the position 2, while i is minor to the size of the ArrayList.
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(2));
			
		}
		//The terminal prints true or false if the element you enter there is in the ArrayList or no.
		System.out.println(al.contains("first element"));
		// It says you the first position of the element you entered in the ArrayList.
		System.out.println(al.indexOf("forth element"));
		// It says you the last position of the element you entered in the Arraylist.
		System.out.println(al.lastIndexOf("first element"));
		// We remove the element of the fifth position.
		al.remove(5);
		// We remove the fifth element
		al.remove("fifth element");
		// We remove all the ArrayList
		al.clear();
		// It says you if the ArrayList is empty or not.
		System.out.println(al.isEmpty());
		// We clone the ArrayList creating its copy.
		ArrayList CopyArray = (ArrayList) al.clone();
		// We transform the ArrayList into an array.
		Object[] array = al.toArray();  
		
	}

}
