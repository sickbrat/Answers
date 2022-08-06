package conditonal_loops;

import java.util.Scanner;

public class rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first diagonal: ");
        double a = sc.nextDouble();
        System.out.print("Enter second diagonal: ");
        double b = sc.nextDouble();
        System.out.print("Enter the choice (from 1, 2, 3): ");
        int choice = sc.nextInt();
        System.out.print("Enter the angle: ");
        double x = sc.nextDouble();

        System.out.println(area_rhombus(a, b, x, choice));
    }
    static double area_rhombus(double a, double b, double angle, int choice) {

        switch (choice) {
            case 1:
                System.out.println("Area of rhombus: " + (a * b));
                break;
            case 2:
                System.out.println("Area of rhombus: " + ((b*b) * Math.sin(angle)));
                break;
            case 3:
                System.out.println("Area of rhombus: " + (0.5 * a * b));
                break;
        }
        return choice;
    }
}
