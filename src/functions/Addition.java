package functions;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num 1: ");
        int a = sc.nextInt();
        System.out.print("Enter num 1: ");
        int b = sc.nextInt();

        System.out.println("Sum is " + sum(a, b));
    }
    static int sum(int a, int b) {
        return a + b;
    }
}
