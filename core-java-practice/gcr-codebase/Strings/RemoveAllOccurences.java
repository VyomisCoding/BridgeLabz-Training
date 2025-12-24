import java.util.*;
public class RemoveAllOccurences {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
        String str = sc.nextLine();
        System.out.print("Character to remove: ");
        char toremove = sc.next().charAt(0);

        StringBuilder out = new StringBuilder();

        for(char c : str.toCharArray()){
            if(c != toremove){
                out.append(c);
            }
        }
        System.out.println("Modified String: " + out);
	}
}
