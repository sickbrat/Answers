package functions;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num 1: ");
        int a = sc.nextInt();
        System.out.print("Enter num 1: ");
        int b = sc.nextInt();

        System.out.println("Product is " + product(a, b));
    }
    static int product(int a, int b) {
        return a * b;
    }
}
