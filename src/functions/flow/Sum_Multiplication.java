package functions.flow;

import java.util.Scanner;

public class Sum_Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Input1: ");
        int n = sc.nextInt();
        System.out.print("Enter Input2: ");
        int m = sc.nextInt();
        System.out.println("Sum is " + result(n, m));

        System.out.println();

        result1(n);
    }
    static int result(int input1, int input2) {
        return input1 + input2;
    }
    static void result1(int a) {
        for (int i = 1; i <= 20; ++i) {
            int res = a * i;
            System.out.println(a + " x " + i + " = " + res);
        }
    }
}
