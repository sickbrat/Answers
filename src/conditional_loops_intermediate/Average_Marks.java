package conditional_loops_intermediate;

import java.util.Scanner;

public class Average_Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        double[] array = new double[count];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter input number " + (i + 1) + ": ");
            array[i] = sc.nextDouble();
        }
    }
    static long average(long marks, int number) {
        int sum = 0;
        for (int i = 0; i < marks; i++) {
            sum += marks;
        }
        sum /= number;
        return sum;

    }
}
