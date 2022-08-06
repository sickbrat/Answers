package conditional_loops_intermediate;
import java.util.*;

public class Power {
    public static void main(String[] args) {
        Scanner dc = new Scanner(System.in);

        System.out.print("Enter any Input: ");
        long n = dc.nextLong();
        System.out.print("Enter the power: ");
        long p = dc.nextLong();

        System.out.println("Power of " + n + " is " + power(n, p));
    }

    static long power(long input, long power) {
        return (long) Math.pow(input, power);
    }
}
