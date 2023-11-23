package seminar2.task3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    // Используйте параметризованные тесты для проверки работы этих операций на различных входных данных и убедитесь, что результаты верны.
    private Calculator calculator;

    @BeforeEach
    void setUp(){
        calculator = new Calculator();
    }

    @AfterEach
    void tearDown(){
        calculator = null;
    }

    @ParameterizedTest
    @DisplayName("Проверка сложения с параметрами")
    @CsvSource({"1, 2, 3", "0, 0, 0", "-1, 1, 0", "10, -5, 5"})
    void testAdd(int a, int b, int expected) {
        int result = calculator.add(a, b);
        assertEquals(expected, result);
    }
    @ParameterizedTest
    @DisplayName("Проверка вычитания с параметрами")
    @CsvSource({"1, 2, -1", "0, 0, 0", "-1, 1, -2", "10, -5, 15"})
    void testSubtract(int a, int b, int expected) {
        assertEquals(expected, calculator.subtract(a,b));
    }

    @ParameterizedTest
    @DisplayName("Проверка умножения с параметрами")
    @CsvSource({"1, 2, 2", "0, 0, 0", "-1, 1, -1", "10, -5, -50"})
    void multiply(int a, int b, int expected) {
        int res = calculator.multiply(a,b);
        assertEquals(expected, res);
    }

    @ParameterizedTest
    @DisplayName("Проверка деления с параметрами")
    @CsvSource({"1, 2, 0.5", "-1, 1, -1", "10, -5, -2"})
    void divide(int a, int b, double expected) {
        double res = calculator.divide(a,b);
        assertEquals(expected, res, 0.001);
    }

    @Test
    @DisplayName("Проверка деления на ноль")
    void whatExceptoinWillBeThrown(){
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(1,0));
    }

    @ParameterizedTest
    @DisplayName("Проверка деления на ноль с параметрами")
    @CsvSource({"1, 0", "-1, 0", "10, 0"})
    void manyExceptions(int a, int b){
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(a,b));
    }

}
