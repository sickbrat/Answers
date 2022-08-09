package functions;

import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the radius of circle: ");
        double radius = sc.nextDouble();

        System.out.println("Circumference is " + circumference(radius));
        System.out.println("Area is " + area(radius));

    }
    static double circumference(double radius) {
        return (2 * Math.PI * radius);
    }
    static double area(double radius) {
        return Math.PI * radius * radius;
    }
}
