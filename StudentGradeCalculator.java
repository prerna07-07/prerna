import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Student Grade Calculator =====");

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks for English: ");
        int english = sc.nextInt();

        System.out.print("Enter marks for Java: ");
        int java = sc.nextInt();

        System.out.print("Enter marks for Maths: ");
        int maths = sc.nextInt();

        System.out.print("Enter marks for DBMS: ");
        int dbms = sc.nextInt();

        System.out.print("Enter marks for Python: ");
        int python = sc.nextInt();

        int total = english + java + maths + dbms + python;

        double percentage = total / 5.0;

        String grade;

        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("\n===== Result =====");
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + total + "/500");
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

        if (percentage >= 40) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }

        sc.close();
    }
}