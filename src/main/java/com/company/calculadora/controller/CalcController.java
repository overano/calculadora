package com.company.calculadora.controller;

import com.company.calculadora.service.CalcService;
import io.corp.calculator.TracerImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CalcController {

  private final CalcService service;
  private TracerImpl tracer = new TracerImpl();

  @GetMapping("/sum/{param1}/{param2}")
  public Integer getSum(@PathVariable("param1") Integer param1,
      @PathVariable("param2") Integer param2) {

    Integer result = service.getSum(param1, param2);

    tracer.trace(result);

    return result;
  }

}
