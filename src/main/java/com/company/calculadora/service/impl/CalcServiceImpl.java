package com.company.calculadora.service.impl;

import com.company.calculadora.service.CalcService;
import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService {
  @Override
  public Integer getSum(Integer param1, Integer param2) {
    return param1 + param2;
  }
}
