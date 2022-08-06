package conditonal_loops;
import java.util.*;

public class area_of_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base length: ");
        double base = sc.nextDouble();
        System.out.print("Enter the height: ");
        double height = sc.nextDouble();

        System.out.println(triangle(base, height));
    }
    static double triangle(double height, double base) {
        return (0.5 * height * base);
    }
}
