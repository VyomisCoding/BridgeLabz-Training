//Challenge Problem: Compare StringBuilder, StringBuffer, FileReader, and InputStreamReader

import java.io.*;
import java.util.*;

public class Comparing{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int iterations = 1_000_000;
        String word = "hello";
        //-----------------------------------------------------------------------------
        StringBuilder sbuilder = new StringBuilder();   // StringBuilder Test 
        long sBuilderStart = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            sbuilder.append(word);
        }
        long sBuilderEnd = System.nanoTime();
        long sBuilderTime = sBuilderEnd - sBuilderStart;
        //-----------------------------------------------------------------------------
        StringBuffer sbuffer = new StringBuffer();     // StringBuffer Test
        long sBufferStart = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            sbuffer.append(word);
        }
        long sBufferEnd = System.nanoTime();
        long sBufferTime = sBufferEnd - sBufferStart;

        System.out.println("\n--- StringBuilder vs StringBuffer Comparison ---");
        System.out.println("Time taken by StringBuilder : " + sBuilderTime + " ns");
        System.out.println("Time taken by StringBuffer  : " + sBufferTime + " ns");
        
        // FileReader vs InputStreamReader -------------------------------------------
        System.out.print("\nEnter large file name to read: ");
        String fileName = sc.nextLine();

        long frStart = System.nanoTime();        // WORD COUNT using FileReader
        int fileReaderWords = countWordsUsingFileReader(fileName);
        long frEnd = System.nanoTime();
        long frTime = frEnd - frStart;

        
        long isrStart = System.nanoTime();       // WORD COUNT using InputStreamReader
        int isrWords = countWordsUsingISR(fileName);
        long isrEnd = System.nanoTime();
        long isrTime = isrEnd - isrStart;

        System.out.println("\n--- FileReader vs InputStreamReader Comparison ---");
        System.out.println("Words counted using FileReader: " + fileReaderWords);
        System.out.println("Time taken by FileReader      : " + frTime + " ns");

        System.out.println("Words counted using ISR       : " + isrWords);
        System.out.println("Time taken by InputStreamReader : " + isrTime + " ns");
    }
    
    public static int countWordsUsingFileReader(String fileName){    // WORD COUNT USING FILEREADER
        int count = 0;
        try{
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                count += words.length;
            }
            br.close();
            fr.close();
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        return count;
    }

    public static int countWordsUsingISR(String fileName){         // WORD COUNT USING INPUTSTREAMREADER
        int count = 0;
        try{ 
            FileInputStream fis = new FileInputStream(fileName);
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
            BufferedReader br = new BufferedReader(isr);
            String line;
            while((line = br.readLine()) != null){
                String[] words = line.split("\\s+");
                count += words.length;
            }
            br.close();
            isr.close();
            fis.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return count;
    }
}
