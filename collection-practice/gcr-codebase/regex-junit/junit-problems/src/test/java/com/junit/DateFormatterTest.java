package com.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class DateFormatterTest{

    @Test
    public void testValidDate(){
        DateFormatter df = new DateFormatter();
        assertEquals("25-01-2024", df.formatDate("2024-01-25"));
    }

    @Test
    public void testInvalidDate(){
        DateFormatter df = new DateFormatter();
        assertThrows(IllegalArgumentException.class, () -> {
            df.formatDate("25-01-2024"); // wrong format
        });
    }
}
