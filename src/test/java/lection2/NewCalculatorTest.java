package lection2;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class NewCalculatorTest {

    private NewCalculator calculator;

    @Test
    void additionExpressionEvaluation() {
        // правильный пример
        assertEquals(4, calculator.calculation(2, 2, '+'));
    }
    @Test
    void subtractionExpressionEvaluation () {
        // неправильный пример - создавать новый объект в каждом тесте
        NewCalculator calculator = new NewCalculator();
        assertThat(calculator.calculation(2,2,'-')).isEqualTo(0);
    }
    @Test
    void multiplicationExpressionEvaluation () {
        NewCalculator calculator = new NewCalculator();
        assertThat(calculator.calculation(2,7,'*')).isEqualTo(14);
    }
    @Test
    void divisionExpressionEvaluation () {
        NewCalculator calculator = new NewCalculator();
        assertThat(calculator.calculation(100,50,'/')).isEqualTo(2);
    }
    @Test
    void expectedIllegalStateExceptionOnInvalidOperatorSymbol ()
    {
        NewCalculator calculator = new NewCalculator();
        assertThatThrownBy(() ->
                calculator.calculation(8,4,'_'))
                .isInstanceOf(IllegalStateException.class);
    }

    @Test
    void getOperandCompletesCorrectlyWithNumbers() {
        String testedValue = "9"; // Значение для тестов
        ByteArrayInputStream in = new ByteArrayInputStream(testedValue.getBytes());
        InputStream inputStream = System.in; // Сохраняем ссылку на ввод с клавиатуры
        System.setIn(in); // Подменяем ввод
        calculator.getOperand(); // Вызываем метод
        System.out.println(testedValue); // Для наглядности вывода
        System.setIn(inputStream); // Подменяем обратно
    }

    @Test
    void getOperandCompletesCorrectlyWithNotNumbers() {
        String testedValue = "k";
        ByteArrayInputStream in = new ByteArrayInputStream(testedValue.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        InputStream inputStream = System.in;
        System.setIn(in);
        System.setOut(new PrintStream(out));
        assertThatThrownBy(() -> calculator .getOperand())
                .isInstanceOf(IllegalStateException.class).describedAs("Ошибка в вводимых данных");
                        System.setIn(inputStream);
        System.setOut(null);
    }
}


