package ru.alfatest;

public class Rectangle {
    double a;
    double b;

    public Rectangle (double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double evaluateArea() {
        return a*b;
    }
}
