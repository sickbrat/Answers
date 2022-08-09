package functions;

import java.util.Scanner;

public class Max_Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int a = sc.nextInt();
        System.out.print("Enter number 2: ");
        int b = sc.nextInt();
        System.out.print("Enter number 3: ");
        int c = sc.nextInt();

        max_min(a, b, c);
    }
    static void max_min(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println(a + " is Greatest");
        } else if (b > a && b > c) {
            System.out.println(b + " is Greatest");
        } else {
            System.out.println(c + " is Greatest");
        }
    }
}
