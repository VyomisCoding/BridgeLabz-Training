import java.util.*;
public class ReplaceMethod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter sentence: ");
        String str =  sc.nextLine();
        System.out.print("Word to replace: ");
        String oldWord = sc.nextLine();
        System.out.print("New word: ");
        String newWord = sc.nextLine();

        String[] parts = str.split(" ");
        StringBuilder res = new StringBuilder();

        for(String w : parts){
            if(w.equals(oldWord)){
                res.append(newWord);
            } else {
                res.append(w);
            }
            res.append(" ");
        }

        System.out.println("Updated Sentence: " + res.toString().trim());
        

	}

}
