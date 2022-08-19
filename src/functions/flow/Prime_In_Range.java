package functions.flow;

import java.util.Scanner;

public class Prime_In_Range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter lower bound: ");
        int l = sc.nextInt();
        System.out.print("Enter upper bound: ");
        int u = sc.nextInt();

        System.out.print("Prime Numbers in given range is/are ");
        for (int i = l; i <= u; i++) {
            if (in_Range(i))
                System.out.print(i + " ");
        }
    }
    static boolean in_Range(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
