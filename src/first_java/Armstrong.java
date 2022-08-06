package first_java;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.println(arm(a));
    }

    static int arm(int a) {
        int originalNum = a;
        int remainder;
        int result = 0;

        while(originalNum != 0) {
            remainder = originalNum % 10;
            result += Math.pow(remainder, 3);
            originalNum /= 10;
        }
        if (result == a) {
            System.out.println(a + " is an Armstrong Number.");
        } else {
            System.out.println("Not an Armstrong Number");
        }
        return result;
    }
}
