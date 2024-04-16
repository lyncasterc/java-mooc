package Part6.Testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void initialState() {
        assertEquals(0, calculator.getValue());
    }

    @Test
    void add() {
        calculator.add(2);

        assertEquals(2, calculator.getValue());

        calculator.add(5);

        assertEquals(7, calculator.getValue());
    }

    @Test
    void subtract() {
        calculator.subtract(2);

        assertEquals(-2, calculator.getValue());

        calculator.subtract(5);

        assertEquals(-7, calculator.getValue());
    }

    @Test
    void multiply() {
        calculator.multiply(3);

        assertEquals(0, calculator.getValue());

        calculator.add(3);
        calculator.multiply(2);

        assertEquals(6, calculator.getValue());

        calculator.multiply(3);

        assertEquals(18, calculator.getValue());

    }


}