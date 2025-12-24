import java.util.*;
public class LexicographicalComparison {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("String 1: ");
        String str1 = sc.nextLine();

        System.out.print("String 2: ");
        String str2 = sc.nextLine();

        int len = Math.min(str1.length(), str2.length());
        int flag = 0;

        for(int i = 0; i < len; i++){
            if(str1.charAt(i) != str2.charAt(i)){
                flag = str1.charAt(i) - str2.charAt(i);
                break;
            }
        }
        if(flag == 0){
            flag = str1.length() - str2.length();
        }

        if(flag < 0) System.out.println(str1 + " comes before " + str2);
        
        else if(flag > 0) System.out.println(str2 + " comes before " + str1);
        
        else System.out.println("Both strings are equal");
	}
}
