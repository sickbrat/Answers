package conditional_loops_intermediate;

import java.util.*;

public class depreciation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter cost of asset: ");
        long cost = sc.nextLong();
        System.out.print("Enter Rate of Deprecation: ");
        long rod = sc.nextLong();
        System.out.print("Enter Residual Value: ");
        long residue = sc.nextLong();
        System.out.print("Enter useful life of asset: ");
        long life = sc.nextLong();

        System.out.println("Enter 1 --> Straight Line Deprecation Method \nEnter 2 --> Diminishing Method");
        System.out.println("Deprecated Value is " + deprecated(cost, rod, residue, life));
    }
    static long deprecated(long cost_of_asset, long rate_deprecation, long residual_value, long useful_life_of_asset) {
        Scanner sc = new Scanner(System.in);
        int operation = sc.nextInt();

        return switch (operation) {
            case 1 -> (cost_of_asset - residual_value) / useful_life_of_asset;
            case 2 -> (cost_of_asset * (rate_deprecation) / 100) / 100;
            default -> 1;
        };
    }
}
