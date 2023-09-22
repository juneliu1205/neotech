package tryCode;

public class ForLoop {

	public static void main(String[] args) {
		
		
		String [] cars= {"bmw", "vw", "toyota"};
		
		
		for (int i=0; i<3; i++) {
			System.out.println(cars[i]);
		}
		
		for (String c: cars) {
			System.out.println(c);
		}
		
		String s = "Magical ponies";

	    for(int i = 0; i < s.length(); i++) {
	      System.out.print(s.charAt(i));
	    }
	    System.out.println();
	    
	    
	    System.out.println("------------------------------");
	    
	    String sb = "Magical ponies";

	    for(int i = sb.length()-1; i >=0; i--) {
	      System.out.print(sb.charAt(i));
	    }
	    System.out.println();
	}

}
