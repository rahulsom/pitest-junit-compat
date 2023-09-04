package com.foo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CalculatorTest {
  private final Calculator calculator = new Calculator();
  @Test
  void testAdd() {
    assertThat(calculator.add(1, 2)).isEqualTo(3);
  }
}
