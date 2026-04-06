// Count the Occurrence of a Word in a File Using FileReader

import java.io.*;
import java.util.*;

public class CountOccurenceOfWordUsingFileReader{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();
        System.out.print("Enter word to count: ");
        String target = sc.nextLine();
        int count = 0;
        try{
           FileReader fr = new FileReader(fileName);
           BufferedReader br = new BufferedReader(fr);
           String line;
           while((line = br.readLine()) != null){            // read line by line
                String[] words = line.split("\\s+");   // Split line into words split by spaces
                for(String w:words){                         // Count matches
                    if(w.equalsIgnoreCase(target)){          // case-insensitive match
                        count++;
                    }
                }
            }
            br.close();
            fr.close();
            System.out.println("\nThe word \"" + target + "\" appears " + count + " times.");
        }catch(Exception e){
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
    
}
