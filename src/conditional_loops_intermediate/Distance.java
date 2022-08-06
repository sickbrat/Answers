package conditional_loops_intermediate;
import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter value of x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter value of y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Enter value of y2: ");
        double y2 = sc.nextDouble();

        System.out.println("Distance is " + distancing(x1, x2, y1, y2) + " units");

    }
    static double distancing(double x1, double x2, double y1, double y2) {
        return Math.sqrt(((x2 - x1)*(x2 - x1)) + ((y2 - y1) * (y2 - y1)));
        }
    }
