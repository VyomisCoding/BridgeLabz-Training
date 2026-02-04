package com.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class CreateStudentJSON{
    public static void main(String[] args) throws Exception{
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode student = mapper.createObjectNode();
        student.put("name", "Vyomesh Pandey");
        student.put("age", 21);
        ArrayNode subjects = mapper.createArrayNode();
        subjects.add("Java");
        subjects.add("DBMS");
        subjects.add("Operating Systems");
        student.set("subjects", subjects);
        System.out.println(student.toPrettyString());
    }
}
