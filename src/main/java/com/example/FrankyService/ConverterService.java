
package com.example.FrankyService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service

public class ConverterService {

    @Value("${dollarOfficial}")
    double officialDolar;

    public double BoliviantoDolar(double bolivian){
        return bolivian/officialDolar;
    }

    public double CelsiusToFarenheit(double celsius){
        return (celsius * 9/5) + 32;
    }
    public double FarenheitToCelsius(double farenheit){
        return (farenheit - 32) * 5/9;
    }
}
