package conditional_loops_intermediate;
import java.util.*;

public class Average_N_Numbers {
    public static void main(String[] args) {

        System.out.println("How many numbers do you want to enter?");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        double[] array = new double[count];
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter input number " + (i + 1) + ": ");
            array[i] = scanner.nextDouble();
        }
        scanner.close();

        for (double v : array) {
            sum = sum + v;
        }

        double average = sum / count;

        System.out.format("The average is: %.2f", average);
    }
}
