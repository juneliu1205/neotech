package tryCode;

public class Recursion {

	public static void main(String[] args) {
	        sayHi(6);
	}
	
		
	static void sayHi(int n) {
if  (n==0) {
	System.out.println("Done");
}else {
		System.out.println("Hi");
		n--;
		sayHi(n);
	}	
		
	}

}
