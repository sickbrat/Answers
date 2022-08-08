package conditional_loops_intermediate;

import java.util.Scanner;

public class Sum_Of_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        int a = sc.nextInt();
        System.out.println("Sum of " + a + " is "+ sum(a));
    }
    static int sum(int input) {
        int result = 0;

        while (input != 0) {
            result = result + input % 10;
            input /= 10;
        }
        return result;
    }
}
