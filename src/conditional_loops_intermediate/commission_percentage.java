package conditional_loops_intermediate;

import java.util.Scanner;

public class commission_percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Sale Price: Rs.");
        long sp = sc.nextLong();
        System.out.print("Enter the Commission Rate: ");
        long cr = sc.nextLong();

        System.out.println("Commission on the product is Rs." + commission(sp, cr));
    }
    static long commission(long sp, long cr) {
        return (sp * cr) / 100;
    }
}
