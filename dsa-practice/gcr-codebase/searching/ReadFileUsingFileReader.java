// Read a File line by line Using FileReader

import java.io.*;
import java.util.*;

public class ReadFileUsingFileReader{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name(with path if needed");
        String fileName = sc.nextLine();

        try{
            FileReader fr = new FileReader(fileName);     // create FileReader Reads characters
            BufferedReader br = new BufferedReader(fr);   // wrap in BufferedReader Reads lines fast
            String line;
            System.out.println("FileContent");
            while((line = br.readLine()) != null){        // read line by line
                System.out.println(line);
            }
            br.close();   // close file
            fr.close();

        }catch( Exception e){
            System.err.println("Error reading file:"+e.getMessage());
        }
    }
}
