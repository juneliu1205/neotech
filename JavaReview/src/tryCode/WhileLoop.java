package tryCode;

public class WhileLoop {

	public static void main(String[] args) {

		int a = 9;
		while(a<5) {
			System.out.println("I love bacon");
			a++;
		}
		

		do {
			System.out.println("I love bacon");
			a++;
		} while (a < 5);
		
		

		int count = 1;

	    while(count <= 100) {
	      System.out.println(count);
	      count = count + 1; // The same as count++;
	    }

	  }
}