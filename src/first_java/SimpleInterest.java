package first_java;
import java.util.*;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the principal: ");
        int p = sc.nextInt();
        System.out.print("Enter the rate: ");
        int r = sc.nextInt();
        System.out.print("Enter the time: ");
        int t = sc.nextInt();

        System.out.println("Simple Interest is given by " + ((p * r * t) / 100));
    }
}
