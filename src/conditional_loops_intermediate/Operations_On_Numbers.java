package conditional_loops_intermediate;

import java.util.Scanner;

public class Operations_On_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, even_sum = 0, odd_sum = 0;

        System.out.println("Enter Numbers: ");
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            if (n < 0) {
                sum += n;
            } else if (n % 2 == 0) {
                even_sum += n;
            } else {
                odd_sum = n;
            }
        }
        System.out.println("Negative Sum: " + sum);
        System.out.println("Positive Sum: " + even_sum);
        System.out.println("Positive Odd Sum: " + odd_sum);
    }
}