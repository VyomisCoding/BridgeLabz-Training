import java.io.*;
import java.util.*;

public class WordCountTop5{
    public static void main(String[] args){
        String file = "text.txt";
        HashMap<String, Integer> map = new HashMap<>();
        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String line;
            while((line = br.readLine()) != null){
                String[] words = line.toLowerCase().split("\\W+"); // Split on non-letters
                for(String w : words){
                    if(!w.isEmpty()){
                        map.put(w, map.getOrDefault(w, 0) + 1);
                    }
                }
            }
        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());       // Sort map by value (frequency)
        list.sort((a, b) -> b.getValue() - a.getValue());                              // Descending order
        System.out.println("Top 5 frequent words:");
        for(int i=0; i<Math.min(5, list.size()); i++){
            System.out.println(list.get(i).getKey() + " = " + list.get(i).getValue());
        }
    }
}
