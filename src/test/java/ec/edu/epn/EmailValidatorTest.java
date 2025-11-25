package ec.edu.epn;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmailValidatorTest {
    private EmailValidator emailValidator;

    static Stream<Arguments> emailValidatorData(){
        return
                Stream.of(
                        Arguments.of("Christian@example.com", true),
                        Arguments.of("christain.suarez@example.com", true),
                        Arguments.of("correo.invalido", false),
                        Arguments.of(null, true)
                );

    }

    @BeforeEach
    public void setup(){
        emailValidator = new EmailValidator();
    }

    @AfterEach
    public void tearDown(){}

    @ParameterizedTest
    @MethodSource("emailValidatorData")
    void isValid_MultipleEmails_ShouldReturnTrue(String email, boolean expected){
        boolean result = emailValidator.isValid(email);

        assertEquals(expected, result);
    }

}
