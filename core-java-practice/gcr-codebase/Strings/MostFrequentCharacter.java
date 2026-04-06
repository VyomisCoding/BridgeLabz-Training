import java.util.*;
public class MostFrequentCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        int[] freq = new int[256];
        
        for(char c : str.toCharArray()){
            freq[c]++;
        }

        char maxChar = 0;
        int maxCount = 0;

        for(int i = 0; i < 256; i++){
            if(freq[i] > maxCount){
                maxCount = freq[i];
                maxChar = (char)i;
            }
        }

        System.out.println("Most Frequent Character: " + maxChar);
	}
}
