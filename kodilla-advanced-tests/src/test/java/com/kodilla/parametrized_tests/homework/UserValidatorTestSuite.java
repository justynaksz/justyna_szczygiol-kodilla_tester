package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {

    UserValidator validator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"jk*%", "jk"})
    public void shouldReturnFalseIfUsernameIsIncorrect(String userName) {
        boolean checkUsername = validator.validateUsername(userName);
        assertFalse(checkUsername);
    }

    @ParameterizedTest
    @ValueSource(strings = {"justyna", "jus_tyna", "737293", "JUSTYNA", "__--"})
    public void shouldReturnTrueIfUsernameIsCorrect(String userName) {
        boolean checkUsername = validator.validateUsername(userName);
        assertTrue(checkUsername);
    }

    @ParameterizedTest
    @ValueSource(strings = {"justyna5325.kodilla.com", "justyna-kodilla@gmail", "justyna_kodilla@gmail.toolong", "justyna635634"})
    public void shouldReturnFalseIfEmailIsIncorrect(String email) {
        boolean checkEmail = validator.validateEmail(email);
        assertFalse(checkEmail);
    }

    @ParameterizedTest
    @ValueSource(strings = {"justyna5325@kodilla.com", "justyna-KODILLA@gmail.com", "justyna.kodilla1000@kodilla.com"})
    public void shouldReturnTrueIfEmailIsIncorrect(String email) {
        boolean checkEmail = validator.validateEmail(email);
        assertTrue(checkEmail);
    }
}