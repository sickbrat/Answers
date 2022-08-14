package functions.flow;

import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any Year: ");
        int a = sc.nextInt();
        System.out.println(leaf(a));
    }
    static int leaf(int year) {
        if (year % 4 == 0) {
            System.out.println(year + " is a Leap Year.");
        } else System.out.println(year + " is not a Leap Year.");
        return year;
    }
}
