package com.json;

import com.fasterxml.jackson.databind.ObjectMapper;
public class ValidateJSON{
    public static void main(String[] args){
        String json = "{ \"name\": \"Amit\", \"age\": 22 }";
        ObjectMapper mapper = new ObjectMapper();
        try{
            mapper.readTree(json);   // If parsed → valid
            System.out.println("Valid JSON!");
        }catch(Exception e){
            System.out.println("Invalid JSON!");
        }
    }
}
