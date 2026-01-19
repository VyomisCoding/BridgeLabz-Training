
import java.io.*;
import java.util.*;

//InputStreamReader : Convert Byte Stream to Character Stream Using InputStreamReader

public class ByteStreamToCharacterStream{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name (encoded in UTF-8");
        String fileName = sc.nextLine();
        try{
            FileInputStream fis = new FileInputStream(fileName);  //read binary data(bytes)
            InputStreamReader isr = new InputStreamReader(fis,"UTF-8");   // convert bytes to characters using InputStreamReader
            BufferedReader br = new BufferedReader(isr);   //for efficient reading
            String line;
            System.out.println("\n--- File Output ---");
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
            br.close();
            isr.close();
            fis.close();
        }catch(Exception e){
            System.err.println("Error:"+e.getMessage());
        }        
    }
    
}
