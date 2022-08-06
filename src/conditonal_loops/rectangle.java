package conditonal_loops;

import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double len = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double bread = sc.nextDouble();
        System.out.println(react(len, bread));
    }
    static double react(double length, double breadth) {
        return (0.5 * (length + breadth));
    }
}
