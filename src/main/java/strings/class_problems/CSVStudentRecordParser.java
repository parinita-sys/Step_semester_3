package main.java.strings.class_problems;

import java.util.Scanner;

public class CSVStudentRecordParser {

    public static void parseStudentRecord(String record) {
        String[] fields = record.split(",");

        if (fields.length != 3) {
            System.out.println("Invalid Record");
            return;
        }

        String name = fields[0].trim();
        String rollNumber = fields[1].trim();
        String department = fields[2].trim();

        System.out.println("Name: " + name +
                " | Roll No: " + rollNumber +
                " | Dept: " + department);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student record: ");
        String record = scanner.nextLine();

        parseStudentRecord(record);

        scanner.close();
    }
}
