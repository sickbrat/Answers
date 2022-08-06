package conditional_loops_intermediate;

import java.util.*;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an long value: ");
        long N = sc.nextLong();
        System.out.println("Factorial of " + N  + " is " + fact(N));
    }
    static long fact(long n) {
        long factorial = 1;
        for (long i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
