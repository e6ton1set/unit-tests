package seminar1;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Fail.fail;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    // Простой пример закомментрован.
    // Далее новая версия класса.
    private Calculator calculator;

   /* @BeforeAll
    public static void initAll() {
        // Здесь можно, например, подключиться к базе данных
    }

    @AfterAll
    public static void tearDownAll() {
        // Закрытие соединения с базой данных
    }

    @BeforeEach
    public void init() {
        calculator = new Calculator(); // Инициализация перед каждым тестом
    }

    @AfterEach
    public void tearDown() {
        calculator = null; // Очистка после каждого теста
    }

    @Test
    @DisplayName("Проверка суммирования")
    public void testAdd() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    @DisplayName("Проверка вычитания")
    public void testSubtract() {
        assertEquals(1, calculator.subtract(3, 2));
    }

    @Test
    @Disabled
    @DisplayName("Тест отключен")
    public void testDisabled() {
        fail("Этот тест не будет выполнен");
    }

    @ParameterizedTest
    // Аннотация показывает, что будет несколько значений.
    // Проверит все значения, даже с ошибкой внутри метода (стандартно будет исключение, тест завершится)
    @ValueSource(ints = {0, 1544, 5, 100})
    // Аннотация указывает на эти значения. Единственная аннотация, где можно задавать аргументы. Проверяет на то, что аргументы работают внутри метода.
    @DisplayName("Параметризованный тест для суммирования")
    public void parameterizedTest(int arg) {
        assertEquals(arg + 2, calculator.add(arg, 2));
    }*/

    @BeforeAll
    static void beforeAll() {
    // Здесь могут быть глобальные операции инициализации
    }

    @AfterAll
    static void afterAll() {
    // Здесь могут быть глобальные операции завершения
    }

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @AfterEach
    void tearDown() {
        calculator = null;
    }

    @Test
    @DisplayName("Проверка суммирования")
    void testAdd() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    @DisplayName("Проверка вычитания")
    void testSubtract() {
        assertEquals(1, calculator.subtract(3, 2));
    }

    @Test
    @DisplayName("Проверка умножения")
    void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    @DisplayName("Проверка деления")
    void testDivide() {
        assertEquals(2.0, calculator.divide(4, 2));
    }

    @Test
    @DisplayName("Проверка деления на ноль")
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(1, 0));
    }

    @Test
    @Disabled("Этот тест отключен")
    void disabledTest() {
        fail("Не будет выполнен");
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 3})
    @DisplayName("Параметризованный тест для умножения на 2")
    void testMultiplyWithParameters(int arg) {
        assertEquals(arg * 2, calculator.multiply(arg, 2));
    }

    @Test
    @DisplayName("Проверка истинного условия")
    void testAssertTrue() {
        assertTrue(calculator.add(2, 2) == 4);
    }

    @Test
    @DisplayName("Проверка ложного условия")
    void testAssertFalse() {
        assertFalse(calculator.add(2, 2) == 5);
    }

    @Test
    @DisplayName("Проверка наличия объекта")
    void testAssertNotNull() {
        assertNotNull(calculator);
    }

    @Test
    @DisplayName("Проверка отсутствия объекта")
    void testAssertNull() {
        calculator = null;
        assertNull(calculator);
    }

    @Test
    @DisplayName("Проверка равенства массивов")
    void testAssertArrayEquals() {
        int[] expected = {1, 2, 3};
        int[] actual = {1, 2, 3};
        assertArrayEquals(expected, actual);
    }
}
