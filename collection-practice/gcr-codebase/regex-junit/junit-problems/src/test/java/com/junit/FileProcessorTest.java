package com.junit;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class FileProcessorTest{
    @Test
    public void testWriteAndRead() throws IOException{
        FileProcessor fp = new FileProcessor();
        String filename = "testfile.txt";
        String content = "Hello JUnit";
        fp.writeToFile(filename, content);
        String result = fp.readFromFile(filename);
        assertEquals(content, result);
    }

    @Test
    public void testFileExistsAfterWrite() throws IOException{
        FileProcessor fp = new FileProcessor();
        String filename = "checkfile.txt";
        fp.writeToFile(filename, "Testing");
        File file = new File(filename);
        assertTrue(file.exists());
    }

    @Test
    public void testReadNonExistingFile(){
        FileProcessor fp = new FileProcessor();
        assertThrows(IOException.class, () -> {
            fp.readFromFile("no_such_file.txt");
        });
    }
}
