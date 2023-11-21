package seminar1;

import org.junit.Test;
import org.junit.jupiter.api.*;
import static org.junit.Assert.assertEquals;

// Фреймворк junit ищет все аннотации с @Test и проверяет их как UNIT тесты.
// То, что происходит внутри методов с анностацией @Test, не отражается на работе программы.
// Тесты не знают друг о друге.

public class TaskOneTest {

    @Test
    public void testMethod() {
        assertEquals(5, 2 + 3);
    }

    @Test
    @BeforeEach
    public void setup() {
        // Инициализация ресурсов - если мы хотим, чтобы метод выполнялся перед каждым тестом.
    }

    @Test
    @AfterEach
    public void teardown() {
        // Очистка ресурсов - если мы хотим, чтобы метод выполнялся после каждого теста.
    }

    @Test
    @BeforeAll
    public static void globalSetup() {
        // Инициализация - если мы хотим, чтобы метод выполнялся один раз перед всеми тестами.
    }

    @Test
    @AfterAll
    public static void globalTeardown() {
        // Очистка ресурсов - если мы хотим, чтобы метод выполнялся один раз после всех тестов.
    }

    @Test
    @DisplayName("Тест суммирования")
    public void testSum() {
        assertEquals(5, 2 + 3);
    }


}
