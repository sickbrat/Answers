package conditional_loops_intermediate;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        int a = sc.nextInt();
        System.out.println(arm(a));
    }
    static int arm(int a) {
        int original = a;
        int remainder;
        int result = 0;

        while(original != 0) {
            remainder = original % 10;
            result += Math.pow(remainder, 3);
            original /= 10;
        }
        if(result == a) {
            System.out.println(a + " is an Armstrong Number.");
        } else {
            System.out.println(a + " is not an Armstrong Number.");
        }
        return result;
    }
}
