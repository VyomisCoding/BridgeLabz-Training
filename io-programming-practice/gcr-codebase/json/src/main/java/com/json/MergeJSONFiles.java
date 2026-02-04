package com.json;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class MergeJSONFiles {
    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        ObjectNode file1 = (ObjectNode) mapper.readTree(new File("file1.json"));
        ObjectNode file2 = (ObjectNode) mapper.readTree(new File("file2.json"));

        file1.setAll(file2);

        System.out.println(file1.toPrettyString());
    }
}
