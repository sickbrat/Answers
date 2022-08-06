package conditonal_loops;

import java.util.Scanner;

public class parallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();
        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();
        System.out.print("Enter the angle: ");
        double x = sc.nextDouble();
        System.out.print("Enter your choice: ");
        int operation = sc.nextInt();

        switch (operation) {
            case 1 -> System.out.println("Area of parallelogram is " + (a * b));
            case 2 -> System.out.println("Area of parallelogram is " + (a * b * Math.sin(x)));
        }
    }
}
