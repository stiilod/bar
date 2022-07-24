package ru.alfatest;

import org.testng.annotations.Test;

public class ProgramTests {
    @Test
    public void testArea() {
        Square square = new Square(5);
        assert 25.0==24.0
    }
}
