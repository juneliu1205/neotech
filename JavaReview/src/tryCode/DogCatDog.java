package tryCode;
import java.util.Scanner;

public class DogCatDog {

	  public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	
	String str = scan.nextLine();
    String cats = str.replaceAll("cat", "");
    String dogs = str.replaceAll("dog", "");
    if (cats.length()==dogs.length())
    {
      System.out.println(true);
    }
    else
    {
      System.out.println(false);
    }
  }
}
	
	

