import java.io.*;

public class EfficientFileCopy{
       public static void main(String[] args){
        String source = "bigfile.dat";              // 100MB example file
        String destNormal = "copy_normal.dat";
        String destBuffered = "copy_buffered.dat";

        //   NORMAL COPY (UNBUFFERED)
        long startNormal = System.nanoTime();  // Start time
        try(FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destNormal)){
            int data;
            // Read/write one byte at a time (slow)
            while((data = fis.read()) != -1){
                fos.write(data);
            }
        }catch(IOException e){
            System.out.println("Error in normal copy: " + e.getMessage());
        }
        long endNormal = System.nanoTime();  // End time
        long normalTime = endNormal - startNormal;
        //   BUFFERED COPY (4 KB CHUNKS)
        long startBuffered = System.nanoTime();
        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destBuffered))) {
            byte[] buffer = new byte[4096];                  // 4 KB buffer
            int bytesRead;
            while((bytesRead = bis.read(buffer)) != -1){     // Read/write in chunks (faster)
                bos.write(buffer, 0, bytesRead);
            }
        }catch(IOException e){
            System.out.println("Error in buffered copy: " + e.getMessage());
        }
        long endBuffered = System.nanoTime();
        long bufferedTime = endBuffered - startBuffered;
        System.out.println("\n--PERFORMANCE REPORT--");        // FINAL RESULT
        System.out.println("Unbuffered Stream Time   : " + normalTime / 1_000_000.0 + " ms");
        System.out.println("Buffered Stream Time     : " + bufferedTime / 1_000_000.0 + " ms");
        if(normalTime > bufferedTime){
            System.out.println("\n Buffered copy is faster by: " + (normalTime - bufferedTime) / 1_000_000.0 + " ms");
        }else{
            System.out.println("\n Unbuffered copy is faster by: " + (bufferedTime - normalTime) / 1_000_000.0 + " ms");
        }
    } 
}
