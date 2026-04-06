//InputStreamReader : Read User Input and Write to File Using InputStreamReader

import java.io.*;
import java.util.*;

public class UserInputUsingInputStreamReader{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the output file name");
        String fileName = sc.nextLine();
        try{
            InputStreamReader isr = new InputStreamReader(System.in);     // Read from console using InputStreamReader
            BufferedReader br = new BufferedReader(isr);
            FileWriter fw = new FileWriter(fileName);                     // FileWriter to write user input to file
            System.out.println("Enter text (type 'exit' to stop):");
            while(true){
                String input = br.readLine();                             // read console input
                if(input.equalsIgnoreCase("exit")){
                    break;
                }
                fw.write(input + "\n");                                   // write each input as new line
            }
            fw.close();
            br.close();
            isr.close();
            System.out.println("Data written to file successfully!");
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
