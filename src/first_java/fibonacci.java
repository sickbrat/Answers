package first_java;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println(fibo(i) + " ");
        }
    }

    static int fibo(int input) {

        if (input <= 1) {
            return input;
        }
        return fibo(input - 1) + fibo(input - 2);
    }
}
