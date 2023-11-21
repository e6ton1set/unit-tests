package lection1;
import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {
    public static void main(String[] args) {
        // Всё ещё ручное тестирование, которое выбрасывает исключения.
        // Например, ошибка может быть семантическая, поэтому тест ничего не покажет.

        if (8 != lection1.Calculator.calculation(2, 6, '+')) {
            throw new AssertionError("Ошибка в методе");
        }
        if (0 != lection1.Calculator.calculation(2, 2, '-')) {
            throw new AssertionError("Ошибка в методе");
        }
        if (14 != lection1.Calculator.calculation(2, 7, '*')) {
            throw new AssertionError("Ошибка в методе");
        }
        if (2 != lection1.Calculator.calculation(100, 50, '/')) {
            throw new AssertionError("Ошибка в методе");
        }

        // Проверка базового функционала с целыми числами, с использованием утверждений (assert):
/*        assert 4 == lection1.Calculator.calculation(2, 2, '+');
        assert 0 == lection1.Calculator.calculation(2, 2, '-');
        assert 14 == lection1.Calculator.calculation(2, 7, '*');
        assert 10 == lection1.Calculator.calculation(100, 10, '/');*/

        // Проверка базового функционала с целыми числами, с использованием утверждений
        AssertJ:
        assertThat(Calculator.calculation(2, 6, '+')).isEqualTo(8);
        assertThat(Calculator.calculation(2, 2, '-')).isEqualTo(0);
        assertThat(Calculator.calculation(2, 7, '*')).isEqualTo(14);
        assertThat(Calculator.calculation(100, 10, '/')).isEqualTo(12); // ожидаемая ошибка

        // Проверка ожидаемого исключения
        assertThatThrownBy( () -> Calculator.calculation(8, 4, '_')
        ).isInstanceOf(IllegalStateException.class);

/*        // Примеры из документации
        assertThat(frodo.getName()).isEqualTo("Frodo");
        // Сравнение срок
        assertThat(frodo).isNotEqualTo(sauron);
        assertThat(fellowshipOfTheRing).hasSize(9) .contains(frodo, sam)
                .doesNotContain(sauron);
        // Размер коллекции и наличие тех или иных элементов
        assertThat(fellowshipOfTheRing).filteredOn(character ->
                character.getName().contains("o")) .containsOnly(aragorn, frodo,
                legolas, boromir);
        // На результатах отфильтрованной коллекции производится проверка
        assertThat(frodo.getAge()).as("check %s's age",
                frodo.getName()).isEqualTo(33);
        // Модификация сообщений об ошибках*/
    }
}
