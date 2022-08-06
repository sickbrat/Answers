package conditional_loops_intermediate;

import java.util.Scanner;

public class CGPA_doubt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements you want to store: ");
        double n = sc.nextInt();
        double[] marks = new double[10];
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextDouble();
        }
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        System.out.println(calc_cgpa(marks, number));
    }

    static double calc_cgpa(double[] marks, int number) {
        double grade[] = new double[number];
        int cgpa, sum = 0;

        for (int i = 0; i < number; i++) {
            grade[i] = marks[i] / 10;
        }
        for (int j = 0; j < number; j++) {
            sum += grade[j];
        }
        cgpa = sum / number;
        return cgpa;
    }
}


// Help me out with this code
// This has to calculate CGPA of students.
