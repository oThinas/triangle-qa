package com.fiap;

public class Triangle {
  private double side1;
  private double side2;
  private double side3;

  public Triangle(double side1, double side2, double side3) throws IllegalArgumentException {
    if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
      throw new IllegalArgumentException("Os lados do triângulo devem ser maiores que zero.");
    } else if (side1 + side2 <= side3 || side2 + side3 <= side1 || side1 + side3 <= side2) {
      throw new IllegalArgumentException("A soma de dois lados deve ser maior que o terceiro lado.");
    }

    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
  }

  public String getType() {
    if (this.side1 == this.side2 && this.side2 == this.side3) {
      return "Equilátero";
    } else if (this.side1 == this.side2 || this.side2 == this.side3 || this.side1 == this.side3) {
      return "Isósceles";
    } else {
      return "Escaleno";
    }
  }
}
