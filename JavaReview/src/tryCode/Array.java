package tryCode;

public class Array {

	public static void main(String[] args) {
		String [] pets= {"dog", "cat","lemur"};
		pets[0]="bird";
		System.out.println(pets[0]);
		
		System.out.println("--------------------");
		
		int [][]a= {{1,3,5,7},
				{2,4,6,8}};
		
		System.out.println(a[1][1]);
		
		System.out.println("--------------------");
		
		char[] characters = {'a', 'b', 'c', 'd'};

	    for(int i = 0; i < characters.length; i++) {
	      System.out.println(characters[i]);
		
	    }
		
	}

}
