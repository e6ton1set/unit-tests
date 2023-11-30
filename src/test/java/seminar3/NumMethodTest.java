package seminar3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumMethodTest {

    private NumMethod numMethod;

    @BeforeEach
    void setUp() {
        numMethod = new NumMethod();
    }

    @AfterEach
    void tearDown() {
        numMethod = null;
    }

    @Test
    @DisplayName("Проверка чётности целого положительного числа")
    void evenOddNumber() {
        assertEquals(true, numMethod.evenOddNumber(10));
    }

    @Test
    @DisplayName("Проверка чётности целого положительного числа")
    void NotEvenOddNumber() {
        assertEquals(false, numMethod.evenOddNumber(11));
    }

    @Test
    @DisplayName("Проверка чётности целого отрицательного числа")
    void evenOddNegativNumber() {
        assertEquals(true, numMethod.evenOddNumber(-22));
    }

    @Test
    void numberInInterval() {
        assertEquals(true, numMethod.numberInInterval(25));
        assertEquals(true, numMethod.numberInInterval(100));
        assertEquals(false, numMethod.numberInInterval(-4));
        assertEquals(false, numMethod.numberInInterval(1999));
    }

    @Test
    void NotNumberInInterval() {
        assertEquals(false, numMethod.numberInInterval(-4));
        assertEquals(false, numMethod.numberInInterval(1999));
    }
}