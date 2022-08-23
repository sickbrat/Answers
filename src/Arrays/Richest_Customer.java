//  Question --> https://leetcode.com/problems/richest-customer-wealth/

package Arrays;

public class Richest_Customer {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 5},
                {5, 6, 7}
        };
        wealth(arr);
    }
    static int wealth(int[][] accounts) {
        int maxi = Integer.MIN_VALUE;

        for (int[] account : accounts) {
            int sum = 0;
            for (int i : account) {
                sum += i;
            }
            maxi = Math.max(maxi, sum);
        }
        return maxi;
    }
}
