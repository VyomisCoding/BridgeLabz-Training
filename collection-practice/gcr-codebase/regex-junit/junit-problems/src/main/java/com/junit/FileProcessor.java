package com.junit;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileProcessor{
    // Write content to file
    public void writeToFile(String filename, String content) throws IOException{
        FileWriter writer = new FileWriter(filename);
        writer.write(content);
        writer.close();
    }
    // Read content from file
    public String readFromFile(String filename) throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line = reader.readLine();
        reader.close();
        return line;
    }
}
