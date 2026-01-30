package com.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TemperatureConverterTest{

    @Test
    public void testCelsiusToFahrenheit(){
        TemperatureConverter tc = new TemperatureConverter();
        assertEquals(32, tc.celsiusToFahrenheit(0));
        assertEquals(212, tc.celsiusToFahrenheit(100));
    }

    @Test
    public void testFahrenheitToCelsius(){
        TemperatureConverter tc = new TemperatureConverter();
        assertEquals(0, tc.fahrenheitToCelsius(32));
        assertEquals(100, tc.fahrenheitToCelsius(212));
    }
}
