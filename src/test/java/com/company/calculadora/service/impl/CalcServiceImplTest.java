package com.company.calculadora.service.impl;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class CalcServiceImplTest {

  @InjectMocks
  CalcServiceImpl service;

  @Test
  void getSum_whenParam1IsOkAndParam2IsOk_thenReturnSum() {
    Integer expected = 3;
    Integer result = service.getSum(1, 2);

    assertEquals(expected, result);
  }

  // TODO Tests validate params, and change code to avoid exceptions if type isn't numeric
}
