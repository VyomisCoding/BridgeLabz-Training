package com.json;

import java.io.File;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FilterJSONAge {
    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();
        JsonNode array = mapper.readTree(new File("users.json"));

        for (JsonNode node : array) {
            if (node.get("age").asInt() > 25) {
                System.out.println(node.toPrettyString());
            }
        }
    }
}
