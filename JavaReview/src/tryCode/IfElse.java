package tryCode;

public class IfElse {
	public static void main(String[] args) {

	    if (5>3) {
	    	System.out.println("5 is greater than 3!");
	    	}
	    
	    int a=5;
	    int b=3;
	    
	    System.out.println(a+ " is greater than " + b);
	    
	    
	    int time = 22;
	    
	    if (time<10) {
	    	System.out.println("Good Morning!");
	    }
	    else if (time>19) {
	    	System.out.println("Good Evening!");
	    }
	    else {
	    	System.out.println("Wrong Input!");
	    }
	    
	    System.out.println("-------------------------------");
	    String text = "tacos";

	    if(text.equals("tacos")) {

	      System.out.println("Yay! Tacos!");

	    } else if(text.equals("pizza")) {

	      System.out.println("Yay! Pizza!");

	    } else if(text.equals("bulgogi")) {

	      System.out.println("Yay! Bulgogi!");

	    } else if(text.equals("fried rice")) {

	      System.out.println("Yay! Fried rice!");

	    } else {

	      System.out.println("Yay! Something new!");

	    }
	    
	    
	    
	    
	    
	    }
}