package conditional_loops_intermediate;

import java.util.Scanner;

public class Average_Marks {
    public static void main(String[] args) {
        int[] mark = new int[5];

        long sum = 0, avg;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks for 5 Subjects: ");
        for (int i = 0; i < mark.length; i++) {
            mark[i] = sc.nextInt();
            sum = sum + mark[i];
        }
        avg = sum / 5;
        System.out.print("Average Marks = " + avg);
    }
}
