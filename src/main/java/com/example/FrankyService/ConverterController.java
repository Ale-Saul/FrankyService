package com.example.FrankyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ConverterController {

    /*ConverterService converterService;
    ConverterController(ConverterService converterService){
        this.converterService = converterService;
    }*/

    @Autowired
    ConverterService converterService;

    @GetMapping("/status")
    public String getStatus() {
        return "ok";
    }

    @PostMapping("/Converter/celsius-to-farenheit")
    public ResponseEntity<ConverterResponseDto> CelsiusToFareheit(@RequestBody ConverterRequestDto converterRequestDto){
        ConverterResponseDto response = new ConverterResponseDto(
                converterService.CelsiusToFarenheit(
                        converterRequestDto.value()
                ),
                "F"
        );
        return ResponseEntity.ok(response);
    }
    @PostMapping("/Converter/farenheit-to-celsius")
    public ResponseEntity<ConverterResponseDto> FarenheitToCelsius(@RequestBody ConverterRequestDto converterRequestDto){
        ConverterResponseDto response = new ConverterResponseDto(
                converterService.FarenheitToCelsius(
                        converterRequestDto.value()
                ),
                "C"
        );
        return ResponseEntity.ok(response);
    }
    @PostMapping("/Converter/bolivian-to-dolar")
    public ResponseEntity<ConverterResponseDto> BolivianToDolar(@RequestBody ConverterRequestDto converterRequestDto){
        ConverterResponseDto response = new ConverterResponseDto(
                converterService.BoliviantoDolar(
                        converterRequestDto.value()
                ),
                "Dolar"
        );
        return ResponseEntity.ok(response);
    }

}
