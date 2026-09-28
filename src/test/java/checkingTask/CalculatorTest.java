package checkingTask;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*
* make sure that the name of packages doesn't have test in the name
*/
public class CalculatorTest {
    @Test
    public void divideShouldReturnCorrectResults() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.divide(10, 2));
    }

    @Test
    void divideShouldThrowWhenDividingByZero() {
        Calculator calc = new Calculator();
        assertThrows(IllegalArgumentException.class, () -> calc.divide(10, 0));
    }

    @Test
    void shouldReturnCorrectSum() {
        Calculator calc = new Calculator();
        int result = calc.sum(2, 3);

        assertEquals(result, 5);
    }
}