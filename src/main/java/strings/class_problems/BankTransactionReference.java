package main.java.strings.class_problems;

import java.util.Scanner;

public class BankTransactionReference {

    public static void validateReference(String input) {

        String reference = input.trim();

        if (reference.length() != 14) {
            System.out.println("Invalid Reference");
            return;
        }

        String bankCode = reference.substring(0, 3).toUpperCase();

        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(reference.charAt(i))) {
                System.out.println("Invalid Reference");
                return;
            }
        }

        for (int i = 3; i < 14; i++) {
            if (!Character.isDigit(reference.charAt(i))) {
                System.out.println("Invalid Reference");
                return;
            }
        }

        String date = reference.substring(3, 9);
        String sequence = reference.substring(9, 14);

        String formattedDate =
                date.substring(0, 2) + "/" +
                        date.substring(2, 4) + "/" +
                        date.substring(4, 6);

        System.out.println("["
                + bankCode
                + "] DATE: "
                + formattedDate
                + " | SEQ: "
                + sequence);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter transaction reference: ");
        String input = scanner.nextLine();

        validateReference(input);

        scanner.close();
    }
}
