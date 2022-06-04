package it.hillel.homework.validator;

import it.hillel.homework.exception.WrongLoginException;
import it.hillel.homework.exception.WrongPasswordException;

public class CredentialsValidator {

    private static final String CREDENTIALS_REGEX = "^\\w{0,19}$";

    public static boolean validate(String login, String password, String confirmPassword) {
        try {
            validateLogin(login);
            validatePassword(password, confirmPassword);
            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    private static void validateLogin(String login) throws WrongLoginException {
        if (!isValidCredential(login)) {
            throw new WrongLoginException("Login does not correspond to requirements");
        }
    }

    private static void validatePassword(String password, String confirmPassword) throws WrongPasswordException {
        if (!isValidCredential(password) || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Password does not correspond to requirements");
        }
    }

    private static boolean isValidCredential(String credential) {
        return credential != null && credential.matches(CREDENTIALS_REGEX);
    }
}
