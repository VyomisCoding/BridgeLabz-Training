package com.json;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

// class Student{
//     String name;
//     int age;
//     Student(String name, int age){
//         this.name = name;
//         this.age = age;
//     }
// }

public class ListToJSONArray{
    public static void main(String[] args) throws Exception{
        List<Student> list = new ArrayList<>();
        list.add(new Student("Vyomesh", 21));
        list.add(new Student("Rahul", 22));
        ObjectMapper mapper = new ObjectMapper();
        String jsonArray = mapper.writeValueAsString(list);
        System.out.println(jsonArray);
    }
}
