package conditonal_loops;

import java.util.Scanner;

public class perimeterOfCircle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the radius of circle: ");
        double radii = sc.nextDouble();

        System.out.println(circumference(radii));
    }
    static double circumference(double radius) {
        return (2 * Math.PI * radius);
    }
}
