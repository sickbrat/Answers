package functions.flow;

import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any Year: ");
        int a = sc.nextInt();
//        System.out.println(leaf(a));

        if_else(a);
    }
    static int leaf(int year) {
        if (year % 4 == 0) {
            System.out.println(year + " is a Leap Year.");
        } else System.out.println(year + " is not a Leap Year.");
        return year;
    }
    static void if_else(int n) {
        if (n % 2 != 0) {
            System.out.println("Weird");
        } else if (n >= 2 && n <= 5) {
            System.out.println("NOT");
        } else if (n >= 6 && n <= 20) {
            System.out.println("Weird");
        } else if (n > 20) {
            System.out.println("nOT");
        }
    }
}
