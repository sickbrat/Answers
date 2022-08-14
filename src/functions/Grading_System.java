package functions;

import java.util.*;

public class Grading_System {
    public static void main(String[] args) {
        grade_calc();
    }
    static void grade_calc() {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[6];
        float total = 0;

        for (int i = 0; i < 6; i++) {
            System.out.print("Enter your Marks in Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total = total +  marks[i];
        }
        float avg = total / 6;
        System.out.print("Grade acquired by Student is ");
        if (avg >= 91) {
            System.out.print("AA");
        } else if (avg >= 81 && avg < 90) {
            System.out.print("AB");
        } else if (avg >= 71 && avg < 80) {
            System.out.print("BB");
        } else if (avg >= 61 && avg < 70) {
            System.out.print("BC");
        } else if (avg >= 51 && avg < 60) {
            System.out.print("CD");
        } else if (avg >= 41 && avg < 50) {
            System.out.print("DD");
        } else if (avg <= 40) System.out.print("Fail");
        System.out.println("\nPercentage Acquired is " + avg + "%");
    }
}
