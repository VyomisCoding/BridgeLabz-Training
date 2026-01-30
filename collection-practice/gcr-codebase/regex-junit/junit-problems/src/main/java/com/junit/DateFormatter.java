package com.junit;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateFormatter{
    public String formatDate(String inputDate){          // Convert yyyy-MM-dd → dd-MM-yyyy
        try{
            LocalDate date = LocalDate.parse(inputDate); // default format yyyy-MM-dd
            return date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        }catch (DateTimeParseException e){
            throw new IllegalArgumentException("Invalid date format");
        }
    }
}
