// Question: https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/

package conditonal_loops;

import java.util.*;

public class ProductAndSumOfAnInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any Integer: ");
        int N = sc.nextInt();

        System.out.println(pAndS(N));
    }
    static int pAndS(int input) {
        int product = 1;
        int sum = 0;

        while(input > 0) {
            product *= input % 10;
            sum += input % 10;
            input /= 10;
        }
        return product - sum;
    }
}
