import java.util.Scanner;
public class NumberIsPositiveNegativeOrZero {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number=sc.nextInt();
        if(number > 0){
            System.out.println("Positive");
        } else if(number < 0){
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}
