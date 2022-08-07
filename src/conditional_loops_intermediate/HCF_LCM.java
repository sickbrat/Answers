package conditional_loops_intermediate;

import java.util.Scanner;

public class HCF_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a = sc.nextInt();
        System.out.print("Enter number 2: ");
        int b = sc.nextInt();

        int LCM, HCF;

        LCM = Math.max(a, b);

        while(true) {
            if(LCM % a == 0 && LCM % b == 0) {
                System.out.println("LCM of " + a + " and " + b + " is " + LCM);
                break;
            }
            ++LCM;
        }
        HCF = (a * b) / LCM;
        System.out.println("HCF_LCM of " + a + " and " + b + " is " + HCF);
    }
}
