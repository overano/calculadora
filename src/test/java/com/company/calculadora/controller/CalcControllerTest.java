package com.company.calculadora.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.company.calculadora.service.impl.CalcServiceImpl;


@ExtendWith(MockitoExtension.class)
class CalcControllerTest {

  @InjectMocks
  CalcController controller;

  @Mock
  CalcServiceImpl service;

  @Test
  void getSum_whenParam1IsOkAndParam2IsOk_thenReturnValidResult() {

    Integer expected = 3;

    when(service.getSum(any(), any())).thenReturn(3);

    Integer result = controller.getSum(1, 2);

    assertEquals(expected, result);

  }

  // TODO validated params to avoid type invalid, change code to use ResponseEntity to use
  // StatusCode.
}
