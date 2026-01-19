import java.io.*;

public class LargeFileReadComparison{
    public static void main(String[] args) throws Exception{
        String filePath = "largefile.txt";       // change the path
        System.out.println("=== Large File Reading Efficiency Test ===");
        System.out.println("File: " + filePath);
        System.out.println();
        long fileReaderTime = readUsingFileReader(filePath);         // Test FileReader
        System.out.println("FileReader Time: " + fileReaderTime + " ms");
        long inputStreamReaderTime = readUsingInputStreamReader(filePath);      // Test InputStreamReader
        System.out.println("InputStreamReader Time: " + inputStreamReaderTime + " ms");
    }
    // ----------------------------------------------------------------------------------------
    private static long readUsingFileReader(String filePath){    // Reads file using FileReader (Character Stream)
        long start = System.currentTimeMillis();
        try(FileReader fr = new FileReader(filePath)){
            int data;
            while((data = fr.read()) != -1){     // Reading character by character (slow for large files)
                // Just reading, NOT printing (printing slows down)
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
    // ----------------------------------------------------------------------------------------
    private static long readUsingInputStreamReader(String filePath){     // Reads file using InputStreamReader (Byte Stream → Character Stream)
        long start = System.currentTimeMillis();
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath))) {
            int data;
            while((data = isr.read()) != -1){       // Also reading character by character but byte-to-char conversion happens internally
                // Just reading
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

}
