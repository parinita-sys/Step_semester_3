package main.java.strings.class_problems;

import java.util.Scanner;

public class MaskedPhoneNumberFormatter {

    public static String formatPhoneNumber(String phone) {

        if (phone.length() != 10) {
            return "Invalid phone number";
        }

        for (int i = 0; i < phone.length(); i++) {
            if (!Character.isDigit(phone.charAt(i))) {
                return "Invalid phone number";
            }
        }

        StringBuilder result = new StringBuilder();

        result.append("XXXXXX-");
        result.append(phone.substring(6));

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter phone number: ");
        String phone = scanner.nextLine();

        System.out.println(formatPhoneNumber(phone));

        scanner.close();
    }
}
