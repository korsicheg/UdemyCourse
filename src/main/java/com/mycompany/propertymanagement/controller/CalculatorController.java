package com.mycompany.propertymanagement.controller;

import com.mycompany.propertymanagement.dto.CalculatorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/calculator")
public class CalculatorController {

    @GetMapping("/add/{num3}")//mix of RequestParam with PathVariable
    public Double add(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2, @PathVariable("num3") Double num3){
        return num1+num2+num3;
    }

    @GetMapping("/sub/{num1}/{num2}")//PathVariable test
    public Double subtract(@PathVariable("num1") Double num1, @PathVariable("num2") Double num2) {
        if(num1>num2){
            return num1-num2;
        }
        else {
            return num2-num1;
        }
    }

    @PostMapping("/mul")
    public ResponseEntity<Double> multiply(@RequestBody CalculatorDTO calculatorDTO){
        Double result = calculatorDTO.getNum1() * calculatorDTO.getNum2() * calculatorDTO.getNum3() * calculatorDTO.getNum4();
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }
}
