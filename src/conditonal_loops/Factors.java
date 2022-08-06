package conditonal_loops;

import java.util.*;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        System.out.println(factor(a));
    }
    static Object factor(int input) {

        for (int i = 1; i <= input; i++) {
            if (input % i == 0) {
                System.out.println("Factor(s) of " + input + " are " + i +  " ");
            }
        }
        return null;
    }
}
