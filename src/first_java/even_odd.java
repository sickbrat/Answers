package first_java;
import java.util.*;

public class even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println(num);

        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num +" is odd.");
        }
    }
}
