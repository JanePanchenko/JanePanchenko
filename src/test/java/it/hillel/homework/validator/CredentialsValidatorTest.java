package it.hillel.homework.validator;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CredentialsValidatorTest {

    private static final String VALID_PASSWORD = "password1";
    private static final String VALID_LOGIN = "login1";

    @Test
    public void shouldReturnTrueWhenLoginConsistsOfOnlyLatinLettersInLowerCase() {
        boolean actual = CredentialsValidator.validate("aaa", VALID_PASSWORD, VALID_PASSWORD);

        assertThat(actual).isTrue();
    }

    @Test
    public void shouldReturnTrueWhenThereAreOnlyLatinLettersInUpperCaseInLogin() {
        boolean actual = CredentialsValidator.validate("BBB", VALID_PASSWORD, VALID_PASSWORD);

        assertThat(actual).isTrue();
    }

    @Test
    public void shouldReturnTrueWhenThereAreOnlyLatinLettersInBothLowerAndUpperCasesInLogin() {
        boolean actual = CredentialsValidator.validate("aBaB", VALID_PASSWORD, VALID_PASSWORD);

        assertThat(actual).isTrue();
    }

    @Test
    public void shouldReturnTrueWhenThereAreOnlyNumbersInLogin() {
        boolean actual = CredentialsValidator.validate("12345678", VALID_PASSWORD, VALID_PASSWORD);

        assertThat(actual).isTrue();
    }

    @Test
    public void shouldReturnTrueWhenThereAreLatinLettersInBothLowerAndUpperCasesAndNumbersInLogin() {
        boolean actual = CredentialsValidator.validate("abAb12345", VALID_PASSWORD, VALID_PASSWORD);

        assertThat(actual).isTrue();
    }

    @Test
    public void shouldReturnTrueWhenThereAreLatinLettersInBothLowerAndUpperCasesAndNumbersWithUnderscoreInLogin() {
        boolean actual = CredentialsValidator.validate("abAb_12345", VALID_PASSWORD, VALID_PASSWORD);

        assertThat(actual).isTrue();
    }

    @Test
    public void shouldReturnFalseWhenThereAreMoreThanNineteenCharactersInLogin() {
        boolean actual = CredentialsValidator.validate("abc1234567890abc1234", VALID_PASSWORD, VALID_PASSWORD);

        assertThat(actual).isFalse();
    }

    @Test
    public void shouldReturnFalseWhenThereAreSpecialSymbolsInLogin() {
        boolean actual = CredentialsValidator.validate("abc12345()", VALID_PASSWORD, VALID_PASSWORD);

        assertThat(actual).isFalse();
    }

    @Test
    public void shouldReturnFalseWhenLoginIsNull() {
        boolean actual = CredentialsValidator.validate(null, VALID_PASSWORD, VALID_PASSWORD);

        assertThat(actual).isFalse();
    }

    @Test
    public void shouldReturnTrueWhenPasswordConsistsOfOnlyLatinLettersInLowerCase() {
        boolean actual = CredentialsValidator.validate(VALID_LOGIN, "aaa", "aaa");

        assertThat(actual).isTrue();
    }

    @Test
    public void shouldReturnTrueWhenThereAreOnlyLatinLettersInUpperCaseInPassword() {
        boolean actual = CredentialsValidator.validate(VALID_LOGIN, "BBB", "BBB");

        assertThat(actual).isTrue();
    }

    @Test
    public void shouldReturnTrueWhenThereAreOnlyLatinLettersInBothLowerAndUpperCasesInPassword() {
        boolean actual = CredentialsValidator.validate(VALID_LOGIN, "aBaB", "aBaB");

        assertThat(actual).isTrue();
    }

    @Test
    public void shouldReturnTrueWhenThereAreOnlyNumbersInPassword() {
        boolean actual = CredentialsValidator.validate(VALID_LOGIN, "12345678", "12345678");

        assertThat(actual).isTrue();
    }

    @Test
    public void shouldReturnTrueWhenThereAreLatinLettersInBothLowerAndUpperCasesAndNumbersInPassword() {
        boolean actual = CredentialsValidator.validate(VALID_LOGIN, "abAb12345", "abAb12345");

        assertThat(actual).isTrue();
    }

    @Test
    public void shouldReturnTrueWhenThereAreLatinLettersInBothLowerAndUpperCasesAndNumbersWithUnderscoreInPassword() {
        boolean actual = CredentialsValidator.validate(VALID_LOGIN, "abAb_12345", "abAb_12345");

        assertThat(actual).isTrue();
    }

    @Test
    public void shouldReturnFalseWhenThereAreMoreThanNineteenCharactersInPassword() {
        boolean actual = CredentialsValidator.validate(VALID_LOGIN, "abc1234567890abc1234", "abc1234567890abc1234");

        assertThat(actual).isFalse();
    }

    @Test
    public void shouldReturnFalseWhenThereAreSpecialSymbolsInPassword() {
        boolean actual = CredentialsValidator.validate(VALID_LOGIN, "abc12345()", "abc12345()");

        assertThat(actual).isFalse();
    }

    @Test
    public void shouldReturnFalseWhenPasswordIsNull() {
        boolean actual = CredentialsValidator.validate(VALID_LOGIN, null, null);

        assertThat(actual).isFalse();
    }

    @Test
    public void shouldReturnFalseWhenPasswordIsNotEqualToConfirmPassword() {
        boolean actual = CredentialsValidator.validate(VALID_LOGIN, VALID_PASSWORD, ")(&^^FCYJTF");

        assertThat(actual).isFalse();
    }
}
