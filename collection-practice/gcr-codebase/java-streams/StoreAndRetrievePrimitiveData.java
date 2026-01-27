import java.io.*;

public class StoreAndRetrievePrimitiveData{
    public static void main(String[] args){
        String file = "student.dat";
        // WRITE DATA 
        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(file))){
            dos.writeInt(101);                // Roll number
            dos.writeUTF("Vyomesh");        // Name
            dos.writeDouble(8.75);            // GPA
            System.out.println("Student data stored successfully!");
        }catch(IOException e){
            System.out.println("Error writing data: " + e.getMessage());
        }
        // READ DATA 
        try(DataInputStream dis = new DataInputStream(new FileInputStream(file))) {
            int roll = dis.readInt();
            String name = dis.readUTF();
            double gpa = dis.readDouble();
            System.out.println("\nRetrieved Student Data:");
            System.out.println("Roll Number: " + roll);
            System.out.println("Name: " + name);
            System.out.println("GPA: " + gpa);
        }catch(IOException e){
            System.out.println("Error reading data: " + e.getMessage());
        }
    }
}
