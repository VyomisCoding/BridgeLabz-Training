import java.io.*;
public class UppercaseToLowercase{
    public static void main(String[] args){
        String source = "input.txt";
        String dest = "lowercase_output.txt";
        try(
                BufferedReader br = new BufferedReader(new FileReader(source));
                BufferedWriter bw = new BufferedWriter(new FileWriter(dest))
        ){
            String line;
            while((line = br.readLine()) != null){
                bw.write(line.toLowerCase());              // Convert uppercase → lowercase
                bw.newLine();
            }
            System.out.println("File converted to lowercase successfully!");
        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
