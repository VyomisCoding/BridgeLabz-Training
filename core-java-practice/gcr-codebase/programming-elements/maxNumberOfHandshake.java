
import java.util.Scanner;

public class maxNumberOfHandshake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfStudents=sc.nextInt();
        int maxHandshakes=(numberOfStudents*(numberOfStudents-1))/2;
        System.out.println("The maximum number of handshakes amoung "+numberOfStudents+" students is "+maxHandshakes);
    }
}
