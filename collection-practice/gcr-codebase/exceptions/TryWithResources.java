import java.io.*;
import java.util.*;

public class TryWithResources{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();   // user input file
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String firstLine = br.readLine();
            System.out.println("First line: " + firstLine);
        }catch(IOException e){
            System.out.println("Error reading file");
        }
    }
}
