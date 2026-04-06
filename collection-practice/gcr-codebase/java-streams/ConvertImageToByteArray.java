
import java.io.*;

public class ConvertImageToByteArray{
    public static void main(String[] args){
        String inputImage = "input.jpg";
        String outputImage = "output.jpg";
        try{                                                      // Read image into byte array
            FileInputStream fis = new FileInputStream(inputImage);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[4096];
            int bytesRead;
            while((bytesRead = fis.read(buffer)) != -1){
                baos.write(buffer, 0, bytesRead);
            }
            fis.close();
            byte[] imageBytes = baos.toByteArray();             // Convert byte array back to image file
            ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
            FileOutputStream fos = new FileOutputStream(outputImage);
            while((bytesRead = bais.read(buffer)) != -1){
                fos.write(buffer, 0, bytesRead);
            }
            fos.close();
            System.out.println("Image copied successfully using ByteArray Streams!");
        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
