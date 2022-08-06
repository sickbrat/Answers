package conditional_loops_intermediate;

import java.util.Scanner;

public class compoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal Value: ");
        long p = sc.nextLong();
        System.out.print("Enter Rate Of Interest: ");
        double r = sc.nextDouble();
        System.out.print("Enter Time-Period: ");
        int t = sc.nextInt();

        System.out.println("Compound Interest is " + compound(p, r, t));
    }

    static double compound(long principal, double rate, long time) {
            return (double) principal * Math.pow(1.0 + (rate / 100), time);
        }
    }
