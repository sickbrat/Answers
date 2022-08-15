package functions.flow;

import java.util.Scanner;

public class LCM_HCF_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num1: ");
        int a = sc.nextInt();
        System.out.print("Enter num2: ");
        int b = sc.nextInt();

        lcm_hcf(a, b);
    }
    static void lcm_hcf(int a, int b) {
        int lcm, hcf;

        lcm = (int) Math.pow(a, b);

        while (true) {
            if (lcm % a == 0 && lcm % b == 0) {
                System.out.println("LCM of " + a + " & " + b + " is " + lcm);
                break;
            }
            ++lcm;
        }
        hcf = (a * b) / lcm;
        System.out.println("HCF of " + a + " & " + b + " is " + hcf);
    }
}
