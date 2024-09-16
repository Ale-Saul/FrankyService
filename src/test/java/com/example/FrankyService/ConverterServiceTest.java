package com.example.FrankyService;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConverterServiceTest {

    @Test
    @DisplayName("Method Converter Celsius To Farenheit")
    void celsiusToFarenheit() {
        ConverterService converterService = new ConverterService();
        assertEquals(212, converterService.CelsiusToFarenheit(100));
    }

    @Test
    @DisplayName("Method Converter Farenheit To Celsius")
    void farenheitToCelsius() {
        ConverterService converterService = new ConverterService();
        assertEquals(100, converterService.FarenheitToCelsius(212));
    }
}