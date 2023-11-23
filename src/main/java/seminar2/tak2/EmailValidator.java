package seminar2.tak2;

import java.util.regex.Pattern;

public class EmailValidator {

    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@(.+)$";
    // Все символы в разном регистре, цифры от 0 до 9, знаки подчёркивания и дефиса,
    // а также после символа @ может быть что угодно, но обязательно -> .+
    private static final Pattern pattern = Pattern.compile(EMAIL_REGEX);

    public boolean isValidEmail(String email) {
        return pattern.matcher(email).matches();
    }
}
