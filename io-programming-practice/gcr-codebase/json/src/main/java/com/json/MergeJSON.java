package com.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class MergeJSON{
    public static void main(String[] args) throws Exception{
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode obj1 = mapper.createObjectNode();
        obj1.put("name", "Vyomesh");
        ObjectNode obj2 = mapper.createObjectNode();
        obj2.put("age", 21);
        ObjectNode merged = mapper.createObjectNode();
        merged.setAll(obj1);
        merged.setAll(obj2);
        System.out.println(merged.toPrettyString());
    }
}
