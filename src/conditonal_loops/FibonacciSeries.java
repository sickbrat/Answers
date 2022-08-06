package conditonal_loops;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println(fibonacci(i));
        }

    }
    static int fibonacci(int input) {
        while (input <= 1) {
            return input;
        }
        return fibonacci(input - 1) + fibonacci(input - 2);
    }
}
