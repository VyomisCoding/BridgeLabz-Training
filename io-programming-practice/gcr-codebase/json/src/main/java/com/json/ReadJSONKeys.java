package com.json;

import java.io.File;
import java.util.Iterator;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadJSONKeys {
    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(new File("data.json"));

        Iterator<String> fieldNames = root.fieldNames();

        while (fieldNames.hasNext()) {
            String key = fieldNames.next();
            JsonNode value = root.get(key);

            System.out.println(key + " : " + value);
        }
    }
}
