import java.util.*;
public class MaxNumberOfHandshakes {
	
	public static int maximumHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of students: ");
        int students = sc.nextInt();
        int handshakes = maximumHandshakes(students);
        System.out.println("Maximum possible handshakes: " + handshakes);
	}

}
