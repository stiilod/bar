package ru.alfatest;

import org.testng.annotations.Test;

public class ProgramTests {
    @Test
    public void testArea() {
        Square square = new Square(5);
        assert square.evaluateSquare()==25;
    }
}
