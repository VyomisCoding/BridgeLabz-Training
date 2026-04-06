package com.json;

import com.fasterxml.jackson.databind.ObjectMapper;

class Car{
    String brand;
    String model;
    int year;
    Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
}

public class CarToJSON{
    public static void main(String[] args) throws Exception {
        Car car = new Car("Tesla", "Model S", 2024);
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(car);
        System.out.println(json);
    }
}
