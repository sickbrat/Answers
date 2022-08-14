package functions;

import java.util.Scanner;

public class Prime_Or_Wot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        int a = sc.nextInt();

        prime(a);
    }
    static void prime(int a) {
        boolean flag = false;

        if (a == 0 || a == 1) {
            System.out.println(a + " is not Prime.");
        } else {
            for (int i = 2; i <= a / 2; ++i) {
                if (a % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println(a + " is Prime.");
            }else System.out.println(a + " is non - prime.");
        }
    }
}
