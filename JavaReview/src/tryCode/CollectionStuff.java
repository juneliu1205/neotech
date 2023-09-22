package tryCode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionStuff {
	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		names.add("June");
		names.add("Andrew");
		names.add("Jasmine");
		names.add("Wendy");
		System.out.println(names);

		names.add(1, "Leo");
		System.out.println(names);

		names.remove(1);
		System.out.println(names);

		names.set(2, "Joe");
		System.out.println(names);

		// How many names in the list?
		System.out.println(names.size());

		// Is out list contains Andrew?
		System.out.println(names.contains("Andrew"));

		Collections.sort(names);
		System.out.println(names);

		Collections.shuffle(names);
		System.out.println(names);

		Collections.reverse(names);
		System.out.println(names);

		String [] namesArray = names.toArray(new String[0]);
		
		System.out.println("--------------------------------------");
		//Array to a a List
		String [] cars = {"Toyota", "Honda", "Chrysler", "Lexus" };
		//List<String> carsList= Arrays.asList(cars);
		//System.out.println(carsList);
		
		//add more car to the List--CANT! the size is fixed
		//UnsupportedOperationException
		//carsList.add("Tesla");
		//System.out.println(carsList);
		
		List<String> carsList= new ArrayList<>(Arrays.asList(cars));
		carsList.add("Tesla");
		System.out.println(carsList);
		
	}

}
