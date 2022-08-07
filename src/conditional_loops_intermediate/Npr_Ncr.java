package conditional_loops_intermediate;

import java.util.*;

public class Npr_Ncr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.print("Enter the value of r: ");
        int r = sc.nextInt();

        if(n >= r) {
            System.out.println("Combination is ==> " + n+"c"+r+": "+ (fact(n)/(fact(n-r))*fact(r)));
            System.out.println("Permutation is ==> " + n+"p"+r+": "+ fact(n)/(fact(n-r)));
        }
    }

    static int fact(int a) {
        int fact = 1;
        for (int i = 1; i <= a; i++) fact *= i;
        return fact;
    }
}
