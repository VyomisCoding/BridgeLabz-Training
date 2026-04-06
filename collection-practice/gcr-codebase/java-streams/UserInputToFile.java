import java.io.*;
public class UserInputToFile{
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name, language;
        int age;
        try{                                              // Take input from user
            System.out.print("Enter your name: ");
            name = br.readLine();
            System.out.print("Enter your age: ");
            age = Integer.parseInt(br.readLine());
            System.out.print("Enter your favorite programming language: ");
            language = br.readLine();
            FileWriter fw = new FileWriter("user_data.txt");             // Write to file
            fw.write("Name: " + name + "\n");
            fw.write("Age: " + age + "\n");
            fw.write("Favorite Language: " + language + "\n");
            fw.close();
            System.out.println("Data saved to user_data.txt");
        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }  
    
}
