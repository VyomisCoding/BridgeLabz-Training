import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double pie = 3.14;
        System.out.print("Enter the Radius: ");
        Double radius = sc.nextDouble();
        System.out.print("Enter the height: ");
        Double height = sc.nextDouble();    
        Double Volume = pie * radius * radius* height;
        System.out.print("the volume of the cylinder is :" + Volume );
        
    }
}