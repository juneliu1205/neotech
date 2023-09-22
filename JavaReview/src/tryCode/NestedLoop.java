package tryCode;

public class NestedLoop {

	public static void main(String[] args) {
		
		 int[][] a = {{1,2,3},{4,5,6}};

		    for(int i = 0; i < a.length; i++) {
		      for(int j = 0; j < a[i].length; j++) {
		        System.out.println(a[i][j]);
		      }
		      System.out.println();
		    }
		    System.out.println("-----------------------");
		    
		    for (int i=0; i<3; i++) {
		    	for (int j =0; j<5; j++) {
		    		System.out.println(i+ " "+ j);
		    	}
		    }
		    
		    //*****
		    //*****
		    //*****
		    //*****
		    
		    
		    for (int i=0; i<4;i++) {
		    	for (int j=0; j<5; j++) {
		    		System.out.print("*");
		    }
		    System.out.println();
		    
	}
		    System.out.println("-----------------------");
		    
		   
		    
		    
		    
		    
		    
		  }

		}