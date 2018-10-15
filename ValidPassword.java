package edos;

import java.util.Scanner;

public class ValidPassword {
    private static Scanner scanner = new Scanner(System.in);
    private static boolean valid;
    private static int numberInt = 0;
    private static int numberUpChar = 0;
    private static int numberLowChar = 0;


    public static void main(String[] args) {
        validPassword();
        System.out.println(valid);
    }

    private static void validPassword() {

        System.out.println("Введите Ваш пароль:");
        String password = scanner.nextLine();
        char[] passArray = password.toCharArray();
        for (char aPassArray : passArray) {
            if (passArray.length < 8) {
                valid = false;
                break;
            }
            try {
                int pass1 = Integer.parseInt(String.valueOf(aPassArray));
                numberInt++;
            } catch (NumberFormatException ignored) {
            }
            if (Character.isUpperCase(aPassArray)) {
                numberUpChar++;
            }
            if (Character.isLowerCase(aPassArray)) {
                numberLowChar++;
            }
            valid = numberInt > 0 && numberUpChar > 0 && numberLowChar > 0;
        }
    }
}

