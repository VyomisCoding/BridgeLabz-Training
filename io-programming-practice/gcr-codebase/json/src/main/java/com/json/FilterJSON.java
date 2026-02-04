package com.json;

import java.io.File;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FilterJSON{
    public static void main(String[] args) throws Exception{
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(new File("people.json"));
        for(JsonNode node : root){
            if(node.get("age").asInt() > 25){
                System.out.println(node.toPrettyString());
            }
        }
    }
}
