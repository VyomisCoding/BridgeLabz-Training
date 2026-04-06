package com.json;

import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

class Student {
    String name;
    int age;
    Student(String name, int age) { this.name = name; this.age = age; }
}

public class ListToJSON {
    public static void main(String[] args) throws Exception {

        List<Student> list = List.of(
                new Student("Vyomesh", 21),
                new Student("Rahul", 28)
        );

        ObjectMapper mapper = new ObjectMapper();
        String jsonArray = mapper.writeValueAsString(list);

        System.out.println(jsonArray);
    }
}
