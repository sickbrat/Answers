package conditonal_loops;
import java.util.*;

public class area_of_circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of circle: ");
        double radius = sc.nextDouble();
        System.out.println(area(radius));
    }

    static double area(double radius) {
        return Math.PI * radius * radius;
    }
}
