package conditional_loops_intermediate;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Original Price: ");
        long op = sc.nextLong();
        System.out.print("Enter Discounted Price: ");
        double discounted = sc.nextDouble();

        System.out.println("Discount is " + discount(op, discounted) + ("%"));

//        System.out.println("Your Discount is " + discounted_price(op, discount));
    }
    static double discounted_price(long original_price, double discount) {
        return original_price - (original_price * discount / 100);
    }
    static double discount(long original_price, double discounted_price) {
        return ((original_price - discounted_price) * 100) / original_price;
    }
}
