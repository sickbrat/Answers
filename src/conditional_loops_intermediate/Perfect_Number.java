package conditional_loops_intermediate;

import java.util.Scanner;

public class Perfect_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any Integer: ");
        int in = sc.nextInt();
        perfect(in);
    }
    static void perfect(int input) {
        long sum = 0;
        int i = 1;

        while(i <= input / 2) {
            if (input % i == 0) {
                sum += i;
            }
            i++;
        }
        if (sum == input) {
            System.out.println(input + " is a perfect number.");
        } else {
            System.out.println(input + " is not a perfect number.");
        }
    }
}
