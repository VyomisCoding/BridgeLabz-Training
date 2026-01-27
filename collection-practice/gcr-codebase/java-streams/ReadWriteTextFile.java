import java.io.*;

public class ReadWriteTextFile{
    public static void main(String[] args){
        String sourceFile = "input.txt";       // Source file (jisme se read karna hai)
        String destFile = "output.txt";        // Destination file (jisme write karna hai)
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try{
            File file = new File(sourceFile);     //   CHECK IF SOURCE FILE EXISTS
            if(!file.exists()){
                System.out.println("Source file does not exist!");
                return; // program exit
            }
            // OPEN STREAMS FOR READ & WRITE
            fis = new FileInputStream(sourceFile);     // Read data byte by byte
            fos = new FileOutputStream(destFile);      // Write data to new file
            int content;
            // READ FROM SOURCE AND WRITE TO DESTINATION
            while((content = fis.read()) != -1){  
                fos.write(content);                  // Write each byte into destination
            }
            System.out.println("File copied successfully from " + sourceFile + " to " + destFile);
        }catch(IOException e){
            System.out.println("Error occurred: " + e.getMessage());
        }finally{
            //   CLOSE BOTH STREAMS SAFELY
            try{
                if (fis != null)
                    fis.close();

                if (fos != null)
                    fos.close();

            }catch(IOException e){
                System.out.println("Error closing file streams: " + e.getMessage());
            }
        }
    }
}
