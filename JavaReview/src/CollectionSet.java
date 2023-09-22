import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionSet {

	public static void main(String[] args) {
	
		Set<String> names = new HashSet<>();
		
		names.add("Jerry");
		names.add("George");
		names.add("Kramer");
		names.add("Elaine");
		System.out.println(names);
		
		//wont able to add the same name 
		names.add("Jerry");
		System.out.println(names);
		
		System.out.println(names.contains("Elaine"));
		System.out.println(names.isEmpty());
		
		names.remove("Kramer");
		System.out.println(names);
		
		System.out.println("--------------------------------------");
		
		//TreeSet is A-Z order
		Set<String> names2 = new TreeSet<>();
		
		names2.add("Jerry");
		names2.add("George");
		names2.add("Kramer");
		names2.add("Elaine");
		System.out.println(names2);
		
		System.out.println("--------------------------------------");
		
		//LinkedHashSet is insert order
		Set<String> names3 = new LinkedHashSet<>();
				
		names3.add("Jerry");
		names3.add("George");
		names3.add("Kramer");
		names3.add("Elaine");
		System.out.println(names3);
		
		System.out.println("--------------------------------------");
		
		
		String [] namesArray = names.toArray(new String[0]);
		
		String [] cars = {"Toyota", "Honda", "Chrysler", "Lexus" };

		Set<String> carsSet= new TreeSet<>(Arrays.asList(cars));
		
		System.out.println(carsSet);
		
		
		
	}

}
