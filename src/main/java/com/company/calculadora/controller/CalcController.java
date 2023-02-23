package com.company.calculadora.controller;

import com.company.calculadora.service.CalcService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CalcController {

    private final CalcService service;

    @GetMapping("/sum/{param1}/{param2}")
    public Integer getSum(@PathVariable("param1") Integer param1, @PathVariable("param2")  Integer param2){
        return service.getSum(param1, param2);
    }

}
