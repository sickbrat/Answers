package conditonal_loops;

import java.util.Scanner;

public class equilateral_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length side: ");
        double side = sc.nextDouble();

        System.out.println(equilateral(side));
    }
    static double equilateral(double side) {
        return (((Math.sqrt(3)) / 4) * side * side);
    }
}
