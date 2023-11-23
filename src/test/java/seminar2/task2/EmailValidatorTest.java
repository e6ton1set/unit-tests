package seminar2.task2;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EmailValidatorTest {
    // Напишите тесты с использованием аннотаций @Test, @Before, @After
    // @BeforeClass, @AfterClass для проверки различных сценариев,
    // включая правильные и неправильные адреса.

    private static EmailValidator emailValidator;

    @BeforeAll
    static void setUp() {
        emailValidator = new EmailValidator();
    }

    @AfterAll
    static void tearDown() {
        emailValidator = null;
    }

    @Test
    void isValidEmail() {
        assertTrue(emailValidator.isValidEmail("123kofa-ioh@mm"));
    }

    @Test
    void isNotValidEmail() {
        assertFalse(emailValidator.isValidEmail("123kofa-ioh"));
    }
}