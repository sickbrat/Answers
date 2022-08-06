package conditonal_loops;

import java.util.Scanner;

public class isosceles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first side: ");
        double first = sc.nextDouble();
        System.out.print("Enter the second side: ");
        double second = sc.nextDouble();
        System.out.print("Your choice: ");
        int operation = sc.nextInt();

        switch (operation) {
            case 1:
                System.out.println("Area of triangle is " + (0.5 * first * second));
                break;
            case 2:
                System.out.println("Area of triangle is " + (0.5 * Math.sqrt(((first * first) - (second * second)) / 4)) * second);
                break;
            case 3:
                System.out.println("Area of triangle is " + (0.5 * first * first));
            default:
                System.out.println("Have a nice day!");
        }
    }
}

