package Exceptions;

public class Main {
    private static final String REGEX = "^[a-zA-Z0-9_]*$";

    public static void main(String[] args) {
        try {
            checkAu("login", "1233", "123");
            System.out.println("Все хоорошо");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Ошибка в регистрации");
        }

    }

    private static void checkAu(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (!login.matches(REGEX) || login.length() > 20) {
            throw new WrongLoginException("Логин неверный");
        }
        if (!password.matches(REGEX) || password.length() > 20 || !password.equals(confirmPassword)) {
            throw new WrongPasswordException();


        }
    }
}

