package com.fiap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class TriangleTest {

  @Test
  public void testScalene() {
    Triangle triangle = new Triangle(3, 4, 5);
    assertEquals("Escaleno", triangle.getType());
  }

  @Test
  public void testIsosceles1() {
    Triangle triangle = new Triangle(3, 3, 5.8);
    assertEquals("Isósceles", triangle.getType());
  }

  @Test
  public void testIsosceles2() {
    Triangle triangle = new Triangle(3, 5, 5);
    assertEquals("Isósceles", triangle.getType());
  }

  @Test
  public void testIsosceles3() {
    Triangle triangle = new Triangle(3, 5, 3);
    assertEquals("Isósceles", triangle.getType());
  }

  @Test
  public void testEquilateral() {
    Triangle triangle = new Triangle(3, 3, 3);
    assertEquals("Equilátero", triangle.getType());
  }

  @Test
  public void testNonPositive() {
    try {
      new Triangle(3, -1, 5);
      fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException exception) {
      assertEquals("Os lados do triângulo devem ser maiores que zero.", exception.getMessage());
    }
  }

  @Test
  public void testZeroSide1() {
    try {
      new Triangle(0, 3, 3);
      fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException exception) {
      assertEquals("Os lados do triângulo devem ser maiores que zero.", exception.getMessage());
    }
  }

  @Test
  public void testZeroSide2() {
    try {
      new Triangle(5, 8, 0);
      fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException exception) {
      assertEquals("Os lados do triângulo devem ser maiores que zero.", exception.getMessage());
    }
  }

  @Test
  public void testInvalidSideLenght1() {
    try {
      new Triangle(3, 3, 9);
      fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException exception) {
      assertEquals("A soma de dois lados deve ser maior que o terceiro lado.", exception.getMessage());
    }
  }

  @Test
  public void testInvalidSideLenght2() {
    try {
      new Triangle(6, 3, 3);
      fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException exception) {
      assertEquals("A soma de dois lados deve ser maior que o terceiro lado.", exception.getMessage());
    }
  }

  @Test
  public void testInvalidSideLenght3() {
    try {
      new Triangle(5, 14, 5.5);
      fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException exception) {
      assertEquals("A soma de dois lados deve ser maior que o terceiro lado.", exception.getMessage());
    }
  }

  @Test
  public void testLargeNumbers() {
    Triangle triangle = new Triangle(Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE);
    assertEquals("Equilátero", triangle.getType());
  }

  @Test
  public void testSmallNumbers() {
    Triangle triangle = new Triangle(Double.MIN_VALUE, Double.MIN_VALUE, Double.MIN_VALUE);
    assertEquals("Equilátero", triangle.getType());
  }

}
