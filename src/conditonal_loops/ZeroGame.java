package conditonal_loops;

import java.util.*;

public class ZeroGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = 0;
        int counter = 1;
        double total = 0;

        System.out.print("Enter num " + counter + ": ");

        while (sc.hasNextDouble()) {
            num1 = sc.nextDouble();
            total += num1;
            counter++;
            System.out.print("Enter num " + counter + " = ");
        }
        System.out.print("Total " + total);
    }
}
