
import java.io.*;
import java.util.*;

public class CheckedExceptions{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name: ");   // user input file name
        String fileName = sc.nextLine();
        try{
            File file = new File(fileName);
            Scanner fileReader = new Scanner(file);
            System.out.println("\nFile Content:");
            while(fileReader.hasNextLine()){
                System.out.println(fileReader.nextLine());
            }
            fileReader.close();
        }catch(IOException e){
            System.out.println("File not found");
        }
    }
}
