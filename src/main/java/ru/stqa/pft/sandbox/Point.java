package ru.stqa.pft.sandbox;

public class Point {

  public double a;
  public double b;

  public Point(double a, double b) {
    this.a = a;
    this.b = b;
  }

  public double distance() {
    return Math.floor(Math.sqrt(a * b));
  }
}
