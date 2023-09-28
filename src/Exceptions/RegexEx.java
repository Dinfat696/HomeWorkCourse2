package Exceptions;

public class RegexEx {
    private static final String REGEX = "^[a-zA-Z0-9_]*$";

    public static void main(String[] args) {
        System.out.println("qwe_rty_123".matches(REGEX));
        System.out.println("qwerty123".matches(REGEX));
        System.out.println("qwe-rty123".matches(REGEX));
    }
}

