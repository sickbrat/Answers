package conditional_loops_intermediate;

import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Year: ");
        int y = sc.nextInt();
        System.out.println(isLeap(y));
    }
    static boolean isLeap(int year) {
        boolean isLeap = false;
        if (year % 4 == 0) {
            isLeap = true;
            System.out.println(year + " is a Leap Year.");
        }
        return isLeap;
    }
}
