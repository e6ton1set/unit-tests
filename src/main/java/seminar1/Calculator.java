package seminar1;

public class Calculator {

/*    Домашнее задание 1.
* ** В классе Calculator создайте метод calculateDiscount, который принимает сумму покупки и процент скидки и возвращает сумму с учетом скидки. Ваша задача - проверить этот метод с использованием библиотеки AssertJ. Если метод calculateDiscount получает недопустимые аргументы, он должен выбрасывать исключение ArithmeticException. Не забудьте написать тесты для проверки этого поведения.*/

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divider cannot be zero.");
        }
        return (double) a / b;
    }

    public double calcDiscount(int cost, double discount, boolean isActive){
        if (discount >= cost){
            throw new ArithmeticException("Неверные данные для расчёта.");
        }
        if (discount <= 0){
            throw new ArithmeticException("Скидка должна быть больше нуля.");
        }
        if (isActive != true){
            throw new ArithmeticException("На этот товар нет скидки.");
        }

        return (double) cost - (cost * (discount / 100.0));
    }
}
