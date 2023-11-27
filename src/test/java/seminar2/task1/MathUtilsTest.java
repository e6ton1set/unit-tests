package seminar2.task1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import seminar2.task1.MathUtils;

import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {
    // Напишите тесты с использованием ассертов:
    // assertEquals, assertTrue, assertFalse, assertNull, assertNotNull
    // и проверьте работу методов на различных наборах данных.

        private MathUtils mathUtils;
        // Создание внутренней ссылки на класс

        @BeforeEach
        void setUp() {
            mathUtils = new MathUtils();
        }

        @AfterEach
        void tearDown() {
            mathUtils = null;
        }

        @Test
        @DisplayName("Проверка сложения")
        void add() {
            assertEquals(5, mathUtils.add(2, 3));
        }

        @Test
        @DisplayName("Проверка вычитания")
        void subtract() {
            assertTrue(5 == mathUtils.subtract(12,7));
        }

        @Test
        @DisplayName("Проверка умножения")
        void multiply() {
            assertFalse(15 != mathUtils.multiply(3,5));
        }

        @Test
        @DisplayName("Проверка существования пустого экземпляра класса")
            void divide() {
                assertFalse(15 != mathUtils.divide(200,10));
            }
    }

