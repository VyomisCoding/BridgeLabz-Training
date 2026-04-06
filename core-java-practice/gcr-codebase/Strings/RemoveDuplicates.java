import java.util.*;
public class RemoveDuplicates {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter a string: ");
		 String str = sc.nextLine();
	     StringBuilder ans = new StringBuilder();
	     boolean[] seen = new boolean[256];
	     for(char c : str.toCharArray()){
	    	 if(!seen[c]){
	    		 ans.append(c);
	             seen[c] = true;
	         }
	     }
	     System.out.println("After removing duplicates: " + ans);
	}
}
